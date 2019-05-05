
package com.gestionCMT.services;

import com.gestionCMT.dao.ExamenDAO;
import com.gestionCMT.dao.ExamenDAOImpl;
import com.gestionCMT.entity.Examen;
import java.util.List;


public class ExamenServicesImpl implements ExamenServices {
    
    ExamenDAO dao = new ExamenDAOImpl();

    @Override
    public void add(Examen e) {
        dao.add(e);
    }

    @Override
    public Examen edite(Examen e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Examen> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Examen findById(Short id) {
        return dao.findById(id);
    }
    
}
