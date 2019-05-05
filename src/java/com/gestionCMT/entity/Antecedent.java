
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="antecedent")
public class Antecedent implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_antecedents;
    
    private String typeA;
    
    private String descriptionA;
    
    private Short id_pat;
    
    public Antecedent(){
        
    }

    /**
     * @return the id_antecedents
     */
    public Short getId_antecedents() {
        return id_antecedents;
    }

    /**
     * @param id_antecedents the id_antecedents to set
     */
    public void setId_antecedents(Short id_antecedents) {
        this.id_antecedents = id_antecedents;
    }

    /**
     * @return the typeA
     */
    public String getTypeA() {
        return typeA;
    }

    /**
     * @param typeA the typeA to set
     */
    public void setTypeA(String typeA) {
        this.typeA = typeA;
    }

    /**
     * @return the descriptionA
     */
    public String getDescriptionA() {
        return descriptionA;
    }

    /**
     * @param descriptionA the descriptionA to set
     */
    public void setDescriptionA(String descriptionA) {
        this.descriptionA = descriptionA;
    }

    /**
     * @return the id_pat
     */
    public Short getId_pat() {
        return id_pat;
    }

    /**
     * @param id_pat the id_pat to set
     */
    public void setId_pat(Short id_pat) {
        this.id_pat = id_pat;
    }
    
}
