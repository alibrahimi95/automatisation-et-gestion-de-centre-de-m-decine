/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionCMT.dao;

import com.gestionCMT.entity.Consultation;
import com.gestionCMT.entity.Traitement;
import java.util.List;

/**
 *
 * @author achour
 */
public interface TraitementDAO {
    public void add(Traitement e);
    
    public Traitement edite(Traitement e);
    
    public void delete(Short id);
    
    public List<Traitement> findAll(Short id);
    
    public Traitement findById(Short id);  
}
