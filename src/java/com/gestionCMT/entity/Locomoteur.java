
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locomoteur")
public class Locomoteur implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_locom;
    
    private String douleurL;
    
    private String géneM;
    
    private String fatigabilité;
    
    private String autreLoc;
    
    private Short idVisite;
    
    public Locomoteur(){
        
    }

    /**
     * @return the id_locom
     */
    public Short getId_locom() {
        return id_locom;
    }

    /**
     * @param id_locom the id_locom to set
     */
    public void setId_locom(Short id_locom) {
        this.id_locom = id_locom;
    }

    /**
     * @return the douleurL
     */
    public String getDouleurL() {
        return douleurL;
    }

    /**
     * @param douleurL the douleurL to set
     */
    public void setDouleurL(String douleurL) {
        this.douleurL = douleurL;
    }

    /**
     * @return the géneM
     */
    public String getGéneM() {
        return géneM;
    }

    /**
     * @param géneM the géneM to set
     */
    public void setGéneM(String géneM) {
        this.géneM = géneM;
    }

    /**
     * @return the fatigabilité
     */
    public String getFatigabilité() {
        return fatigabilité;
    }

    /**
     * @param fatigabilité the fatigabilité to set
     */
    public void setFatigabilité(String fatigabilité) {
        this.fatigabilité = fatigabilité;
    }

    /**
     * @return the autreLoc
     */
    public String getAutreLoc() {
        return autreLoc;
    }

    /**
     * @param autreLoc the autreLoc to set
     */
    public void setAutreLoc(String autreLoc) {
        this.autreLoc = autreLoc;
    }

    /**
     * @return the idVisite
     */
    public Short getIdVisite() {
        return idVisite;
    }

    /**
     * @param idVisite the idVisite to set
     */
    public void setIdVisite(Short idVisite) {
        this.idVisite = idVisite;
    }
    
    
}
