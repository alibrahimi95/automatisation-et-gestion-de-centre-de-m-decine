
package com.gestionCMT.dao;

import com.gestionCMT.entity.Examen;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class ExamenDAOImpl implements ExamenDAO {
        Session session = HibernateUtil.openSession();
        
    @Override
    public void add(Examen e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Examen edite(Examen e) {
        session.beginTransaction();
        Examen p = (Examen) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Examen p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Examen> findAll(Short id) {
        return session.createQuery("select o from Examen o where id_pat ="+id+"  ").list();

    }

    @Override
    public Examen findById(Short id) {
        return (Examen) session.get(Examen.class, id);
    }
    
}
