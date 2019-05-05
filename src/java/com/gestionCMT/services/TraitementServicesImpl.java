
package com.gestionCMT.services;

import com.gestionCMT.dao.TraitementDAO;
import com.gestionCMT.dao.TraitementDAOImpl;
import com.gestionCMT.entity.Traitement;
import java.util.List;


public class TraitementServicesImpl implements TraitementServices {
    TraitementDAO dao = new TraitementDAOImpl();

    @Override
    public void add(Traitement e) {
        dao.add(e);
    }

    @Override
    public Traitement edite(Traitement e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Traitement> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Traitement findById(Short id) {
        return dao.findById(id);
    }
    
    
}
