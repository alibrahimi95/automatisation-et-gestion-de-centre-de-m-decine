
package com.gestionCMT.dao;

import com.gestionCMT.entity.Locomoteur;
import java.util.List;


public interface LocomoteurDAO {
    public void add(Locomoteur e);
    
    public Locomoteur edite(Locomoteur e);
    
    public void delete(Short id);
    
    public List<Locomoteur> findAll(Short id);
    
    public Locomoteur findById(Short id);
}
