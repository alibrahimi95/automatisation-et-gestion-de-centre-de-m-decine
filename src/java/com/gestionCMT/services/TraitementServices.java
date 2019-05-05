
package com.gestionCMT.services;

import com.gestionCMT.entity.Traitement;
import java.util.List;


public interface TraitementServices {
       public void add(Traitement e);
    
    public Traitement edite(Traitement e);
    
    public void delete(Short id);
    
    public List<Traitement> findAll(Short id);
    
    public Traitement findById(Short id); 
}
