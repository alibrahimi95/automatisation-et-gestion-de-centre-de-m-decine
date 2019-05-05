
package com.gestionCMT.dao;

import com.gestionCMT.entity.Opht;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class OphtDAOImpl implements OphtDAO {
     Session session = HibernateUtil.openSession();


    @Override
    public void add(Opht e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Opht edite(Opht e) {
        session.beginTransaction();
        Opht p = (Opht) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Opht p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Opht> findAll(Short id) {
        return session.createQuery("select o from Opht o where idVisite ="+id+"  ").list();

    }

    @Override
    public Opht findById(Short id) {
        return (Opht) session.get(Opht.class, id);
    }
}
