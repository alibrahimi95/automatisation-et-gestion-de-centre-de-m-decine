
package com.gestionCMT.services;

import com.gestionCMT.dao.AntecedentDAO;
import com.gestionCMT.dao.AntecedentDAOImpl;
import com.gestionCMT.entity.Antecedent;
import java.util.List;


public class AntecedentServicesImpl implements AntecedentServices {
    AntecedentDAO dao = new AntecedentDAOImpl();

    @Override
    public void add(Antecedent e) {
        dao.add(e);
    }

    @Override
    public Antecedent edite(Antecedent e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Antecedent> findAll(Short id) {
        return dao.findAll(id);
    }

    @Override
    public Antecedent findById(Short id) {
        return dao.findById(id);
    }
    
}
