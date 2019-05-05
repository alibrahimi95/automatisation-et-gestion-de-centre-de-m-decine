
package com.gestionCMT.services;

import com.gestionCMT.entity.Patient;
import java.util.List;


public interface PatientServices {
        public void add(Patient e);
    
    public Patient edite(Patient e);
    
    public void delete(Short id);
    
    public List<Patient> findAll();
    
    public Patient findById(Short id);
    
}
