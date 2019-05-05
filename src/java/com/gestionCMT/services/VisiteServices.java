
package com.gestionCMT.services;

import com.gestionCMT.entity.Visite;
import java.util.List;


public interface VisiteServices {
     public void add(Visite e);
    
    public Visite edite(Visite e);
    
    public void delete(Short id);
    
    public List<Visite> findAll(Short id);
    
    public Visite findById(Short id);
}
