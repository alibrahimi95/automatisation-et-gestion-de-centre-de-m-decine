
package com.gestionCMT.services;

import com.gestionCMT.entity.Respiratoire;
import java.util.List;


public interface RespiratoireServices {
    public void add(Respiratoire e);
    
    public Respiratoire edite(Respiratoire e);
    
    public void delete(Short id);
    
    public List<Respiratoire> findAll(Short id);
    
    public Respiratoire findById(Short id);
}
