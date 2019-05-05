
package com.gestionCMT.services;

import com.gestionCMT.dao.UsersDAO;
import com.gestionCMT.dao.UsersDAOImpl;
import com.gestionCMT.entity.Users;
import java.util.List;


public class UsersServicesImp implements UsersServices {
    
    UsersDAO dao = new UsersDAOImpl();

    @Override
    public void add(Users e) {
        dao.add(e);
    }

    @Override
    public Users edite(Users e) {
        return dao.edite(e);
    }

    @Override
    public void delete(Short id) {
        dao.delete(id);
    }

    @Override
    public List<Users> findAll(String p, String pw) {
        return dao.findAll(p, pw);
    }

    @Override
    public Users findById(Short id) {
        return dao.findById(id);
    }
    
    
    
}
