
package com.gestionCMT.dao;

import com.gestionCMT.entity.Orl;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class OrlDAOImpl implements OrlDAO {
     Session session = HibernateUtil.openSession();


    @Override
    public void add(Orl e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Orl edite(Orl e) {
        session.beginTransaction();
        Orl p = (Orl) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Orl p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Orl> findAll(Short id) {
        return session.createQuery("select o from Orl o where idVisite ="+id+"  ").list();

    }

    @Override
    public Orl findById(Short id) {
        return (Orl) session.get(Orl.class, id);
    }
}
