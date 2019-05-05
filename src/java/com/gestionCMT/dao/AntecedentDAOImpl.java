
package com.gestionCMT.dao;

import com.gestionCMT.entity.Antecedent;
import com.gestionCMT.entity.Patient;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class AntecedentDAOImpl implements AntecedentDAO {
    Session session = HibernateUtil.openSession();


    @Override
    public void add(Antecedent e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Antecedent edite(Antecedent e) {
        session.beginTransaction();
        Antecedent p = (Antecedent) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Antecedent p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Antecedent> findAll(Short id) {
        return session.createQuery("select o from Antecedent o where id_pat ="+id+"  ").list();

    }

    @Override
    public Antecedent findById(Short id) {
        return (Antecedent) session.get(Antecedent.class, id);
    }
}
