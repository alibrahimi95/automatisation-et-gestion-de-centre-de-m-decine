
package com.gestionCMT.services;

import com.gestionCMT.entity.Examen;
import java.util.List;


public interface ExamenServices {
    
     public void add(Examen e);
    
    public Examen edite(Examen e);
    
    public void delete(Short id);
    
    public List<Examen> findAll(Short id);
    
    public Examen findById(Short id);
}
