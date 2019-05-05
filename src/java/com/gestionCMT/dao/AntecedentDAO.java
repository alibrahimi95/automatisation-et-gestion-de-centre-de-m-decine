
package com.gestionCMT.dao;

import com.gestionCMT.entity.Antecedent;

import java.util.List;


public interface AntecedentDAO {
       public void add(Antecedent e);
    
    public Antecedent edite(Antecedent e);
    
    public void delete(Short id);
    
    public List<Antecedent> findAll(Short id);
    
    public Antecedent findById(Short id);
}
