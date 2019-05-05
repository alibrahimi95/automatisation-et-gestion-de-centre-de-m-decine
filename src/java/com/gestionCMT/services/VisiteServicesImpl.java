
package com.gestionCMT.services;

import com.gestionCMT.dao.VisiteDAO;
import com.gestionCMT.dao.VisiteDAOImpl;
import com.gestionCMT.entity.Visite;
import java.util.List;


public class VisiteServicesImpl implements VisiteServices {
    VisiteDAO dao = new VisiteDAOImpl();

    @Override
    public void add(Visite e) {
        dao.add(e);
    }

    @Override
    public Visite edite(Visite e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Visite> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Visite findById(Short id) {
        return dao.findById(id);
    }
    
}
