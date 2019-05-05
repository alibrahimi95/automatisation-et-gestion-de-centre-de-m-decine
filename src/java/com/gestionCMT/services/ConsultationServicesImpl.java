
package com.gestionCMT.services;

import com.gestionCMT.dao.ConsultationDAO;
import com.gestionCMT.dao.ConsultationDAOImpl;
import com.gestionCMT.entity.Consultation;
import java.util.List;


public class ConsultationServicesImpl implements ConsultationServices {
    ConsultationDAO dao = new ConsultationDAOImpl();

    @Override
    public void add(Consultation e) {
        dao.add(e);
    }

    @Override
    public Consultation edite(Consultation e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Consultation> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Consultation findById(Short id) {
        return dao.findById(id);
    }
    
}
