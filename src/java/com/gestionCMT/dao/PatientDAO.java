
package com.gestionCMT.dao;

import com.gestionCMT.entity.Patient;
import java.util.List;


public interface PatientDAO {
    public void add(Patient e);
    
    public Patient edite(Patient e);
    
    public void delete(Short id);
    
    public List<Patient> findAll();
    
    public Patient findById(Short id);
    
}
