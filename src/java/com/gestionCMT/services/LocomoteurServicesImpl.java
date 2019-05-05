
package com.gestionCMT.services;

import com.gestionCMT.dao.LocomoteurDAO;
import com.gestionCMT.dao.LocomoteurDAOImpl;
import com.gestionCMT.entity.Locomoteur;
import java.util.List;


public class LocomoteurServicesImpl implements LocomoteurServices {
    LocomoteurDAO dao = new LocomoteurDAOImpl();

    @Override
    public void add(Locomoteur e) {
        dao.add(e);
    }

    @Override
    public Locomoteur edite(Locomoteur e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Locomoteur> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Locomoteur findById(Short id) {
        return dao.findById(id);
    }
    
}
