
package com.gestionCMT.dao;

import com.gestionCMT.entity.Patient;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class PatientDAOImpl implements PatientDAO {
    Session session = HibernateUtil.openSession();


    @Override
    public void add(Patient e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Patient edite(Patient e) {
        session.beginTransaction();
        Patient p = (Patient) session.merge(e);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Patient p = findById(id);
        session.delete(p);
        session.getTransaction().commit();
    }

    @Override
    public List<Patient> findAll() {
        return session.createQuery("select o from Patient o").list();

    }

    @Override
    public Patient findById(Short id) {
        return (Patient) session.get(Patient.class, id);
    }
    
}
