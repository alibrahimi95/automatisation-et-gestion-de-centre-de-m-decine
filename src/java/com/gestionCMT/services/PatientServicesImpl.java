
package com.gestionCMT.services;

import com.gestionCMT.dao.PatientDAO;
import com.gestionCMT.dao.PatientDAOImpl;
import com.gestionCMT.entity.Patient;
import java.util.List;


public class PatientServicesImpl implements PatientServices {
    PatientDAO dao = new PatientDAOImpl();
    
    @Override
    public void add(Patient e) {
        dao.add(e);
    }

    @Override
    public Patient edite(Patient e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Patient> findAll() {
        return dao.findAll();
    }

    @Override
    public Patient findById(Short id) {
        return dao.findById(id);
    }
    
}
