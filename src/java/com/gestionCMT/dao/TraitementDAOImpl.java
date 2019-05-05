
package com.gestionCMT.dao;

import com.gestionCMT.entity.Traitement;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class TraitementDAOImpl implements TraitementDAO{
    Session session = HibernateUtil.openSession();


    @Override
    public void add(Traitement e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Traitement edite(Traitement e) {
        session.beginTransaction();
        Traitement p = (Traitement) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Traitement p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Traitement> findAll(Short id) {
        return session.createQuery("select o from Traitement o where id_pat ="+id+"  ").list();

    }

    @Override
    public Traitement findById(Short id) {
        return (Traitement) session.get(Traitement.class, id);
    }
}
