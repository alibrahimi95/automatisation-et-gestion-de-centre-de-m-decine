
package com.gestionCMT.dao;

import com.gestionCMT.entity.Locomoteur;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class LocomoteurDAOImpl implements LocomoteurDAO {
     Session session = HibernateUtil.openSession();


    @Override
    public void add(Locomoteur e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Locomoteur edite(Locomoteur e) {
        session.beginTransaction();
        Locomoteur p = (Locomoteur) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Locomoteur p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Locomoteur> findAll(Short id) {
        return session.createQuery("select o from Locomoteur o where idVisite ="+id+"  ").list();

    }

    @Override
    public Locomoteur findById(Short id) {
        return (Locomoteur) session.get(Locomoteur.class, id);
    }
}
