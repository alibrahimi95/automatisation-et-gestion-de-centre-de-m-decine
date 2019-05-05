
package com.gestionCMT.services;

import com.gestionCMT.entity.Opht;
import java.util.List;


public interface OphtServices {
      public void add(Opht e);
    
    public Opht edite(Opht e);
    
    public void delete(Short id);
    
    public List<Opht> findAll(Short id);
    
    public Opht findById(Short id);
}
