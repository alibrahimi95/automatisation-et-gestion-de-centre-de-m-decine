
package com.gestionCMT.dao;

import com.gestionCMT.entity.Consultation;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class ConsultationDAOImpl implements ConsultationDAO {
    Session session = HibernateUtil.openSession();


    @Override
    public void add(Consultation e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Consultation edite(Consultation e) {
        session.beginTransaction();
        Consultation p = (Consultation) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Consultation p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Consultation> findAll(Short id) {
        return session.createQuery("select o from Consultation o where id_pat ="+id+"  ").list();

    }

    @Override
    public Consultation findById(Short id) {
        return (Consultation) session.get(Consultation.class, id);
    }
}
