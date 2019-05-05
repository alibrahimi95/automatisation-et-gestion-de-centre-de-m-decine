
package com.gestionCMT.services;

import com.gestionCMT.dao.OphtDAO;
import com.gestionCMT.dao.OphtDAOImpl;
import com.gestionCMT.entity.Opht;
import java.util.List;


public class OphtServicesImpl implements OphtServices {
    OphtDAO dao = new OphtDAOImpl();

    @Override
    public void add(Opht e) {
        dao.add(e);
    }

    @Override
    public Opht edite(Opht e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Opht> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Opht findById(Short id) {
        return dao.findById(id);
    }
    
}
