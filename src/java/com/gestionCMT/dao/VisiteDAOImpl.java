
package com.gestionCMT.dao;

import com.gestionCMT.entity.Visite;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class VisiteDAOImpl implements VisiteDAO {
    Session session = HibernateUtil.openSession();


    @Override
    public void add(Visite e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Visite edite(Visite e) {
        session.beginTransaction();
        Visite p = (Visite) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Visite p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Visite> findAll(Short id) {
        return session.createQuery("select o from Visite o where id_pat ="+id+"  ").list();

    }

    @Override
    public Visite findById(Short id) {
        return (Visite) session.get(Visite.class, id);
    }
    
}
