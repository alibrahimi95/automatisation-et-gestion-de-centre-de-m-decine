
package com.gestionCMT.services;

import com.gestionCMT.entity.Consultation;
import java.util.List;


public interface ConsultationServices {
  public void add(Consultation e);
    
    public Consultation edite(Consultation e);
    
    public void delete(Short id);
    
    public List<Consultation> findAll(Short id);
    
    public Consultation findById(Short id);    
}
