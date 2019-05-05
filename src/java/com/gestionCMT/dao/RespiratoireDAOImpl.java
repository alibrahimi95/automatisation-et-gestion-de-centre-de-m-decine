
package com.gestionCMT.dao;

import com.gestionCMT.entity.Respiratoire;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class RespiratoireDAOImpl implements RespiratoireDAO {
     Session session = HibernateUtil.openSession();


    @Override
    public void add(Respiratoire e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Respiratoire edite(Respiratoire e) {
        session.beginTransaction();
        Respiratoire p = (Respiratoire) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Respiratoire p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Respiratoire> findAll(Short id) {
        return session.createQuery("select o from Respiratoire o where idVisite ="+id+"  ").list();

    }

    @Override
    public Respiratoire findById(Short id) {
        return (Respiratoire) session.get(Respiratoire.class, id);
    }
}
