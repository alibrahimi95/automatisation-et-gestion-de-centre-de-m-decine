
package com.gestionCMT.services;

import com.gestionCMT.entity.Users;
import java.util.List;


public interface UsersServices {
    
      public void add(Users e);
    
    public Users edite(Users e);
    
    public void delete(Short id);
    
    public List<Users> findAll(String pseudo, String pass);

    
    public Users findById(Short id);
    
}
