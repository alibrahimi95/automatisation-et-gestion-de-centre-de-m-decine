
package com.gestionCMT.services;

import com.gestionCMT.dao.RespiratoireDAO;
import com.gestionCMT.dao.RespiratoireDAOImpl;
import com.gestionCMT.entity.Respiratoire;
import java.util.List;


public class RespiratoireServicesImpl implements RespiratoireServices {
    RespiratoireDAO dao = new RespiratoireDAOImpl();

    @Override
    public void add(Respiratoire e) {
        dao.add(e);
    }

    @Override
    public Respiratoire edite(Respiratoire e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Respiratoire> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Respiratoire findById(Short id) {
        return dao.findById(id);
    }
    
}
