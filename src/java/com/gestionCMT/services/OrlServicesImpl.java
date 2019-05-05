
package com.gestionCMT.services;

import com.gestionCMT.dao.OrlDAO;
import com.gestionCMT.dao.OrlDAOImpl;
import com.gestionCMT.entity.Orl;
import java.util.List;


public class OrlServicesImpl implements OrlServices {
    OrlDAO dao = new OrlDAOImpl();

    @Override
    public void add(Orl e) {
        dao.add(e);
    }

    @Override
    public Orl edite(Orl e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Orl> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Orl findById(Short id) {
        return dao.findById(id);
    }
    
}
