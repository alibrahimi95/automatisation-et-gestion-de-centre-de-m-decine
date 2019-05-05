
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orl")
public class Orl implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_orl;
    
    private String sifflement;
    
    private String engines;
    
    private String epistaxis;
    
    private String entendMal;
    
    private String otorrhees;
    
    private String eternument;
    
    private String rhinorrhee;
    
    private String autreOrl;
    
    private Short idVisite;
    
    public Orl(){
        
    }

    /**
     * @return the id_orl
     */
    public Short getId_orl() {
        return id_orl;
    }

    /**
     * @param id_orl the id_orl to set
     */
    public void setId_orl(Short id_orl) {
        this.id_orl = id_orl;
    }

    /**
     * @return the sifflement
     */
    public String getSifflement() {
        return sifflement;
    }

    /**
     * @param sifflement the sifflement to set
     */
    public void setSifflement(String sifflement) {
        this.sifflement = sifflement;
    }

    /**
     * @return the engines
     */
    public String getEngines() {
        return engines;
    }

    /**
     * @param engines the engines to set
     */
    public void setEngines(String engines) {
        this.engines = engines;
    }

    /**
     * @return the epistaxis
     */
    public String getEpistaxis() {
        return epistaxis;
    }

    /**
     * @param epistaxis the epistaxis to set
     */
    public void setEpistaxis(String epistaxis) {
        this.epistaxis = epistaxis;
    }

    /**
     * @return the entendMal
     */
    public String getEntendMal() {
        return entendMal;
    }

    /**
     * @param entendMal the entendMal to set
     */
    public void setEntendMal(String entendMal) {
        this.entendMal = entendMal;
    }

    /**
     * @return the otorrhees
     */
    public String getOtorrhees() {
        return otorrhees;
    }

    /**
     * @param otorrhees the otorrhees to set
     */
    public void setOtorrhees(String otorrhees) {
        this.otorrhees = otorrhees;
    }

    /**
     * @return the eternument
     */
    public String getEternument() {
        return eternument;
    }

    /**
     * @param eternument the eternument to set
     */
    public void setEternument(String eternument) {
        this.eternument = eternument;
    }

    /**
     * @return the rhinorrhee
     */
    public String getRhinorrhee() {
        return rhinorrhee;
    }

    /**
     * @param rhinorrhee the rhinorrhee to set
     */
    public void setRhinorrhee(String rhinorrhee) {
        this.rhinorrhee = rhinorrhee;
    }

    /**
     * @return the autreOrl
     */
    public String getAutreOrl() {
        return autreOrl;
    }

    /**
     * @param autreOrl the autreOrl to set
     */
    public void setAutreOrl(String autreOrl) {
        this.autreOrl = autreOrl;
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
