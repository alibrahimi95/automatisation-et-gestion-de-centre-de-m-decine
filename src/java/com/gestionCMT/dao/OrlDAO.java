
package com.gestionCMT.dao;

import com.gestionCMT.entity.Orl;
import java.util.List;


public interface OrlDAO {
    public void add(Orl e);
    
    public Orl edite(Orl e);
    
    public void delete(Short id);
    
    public List<Orl> findAll(Short id);
    
    public Orl findById(Short id);
}
