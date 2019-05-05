
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="opht")
public class Opht implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_opht;
    
    private String larmoiment;
    
    private String douleurO;
    
    private String taches;
    
    private String oeilRouge;
    
    private String fatigue;
    
    private String autreO;
    
    private Short idVisite;
    
    public Opht(){
        
    }

    /**
     * @return the id_opht
     */
    public Short getId_opht() {
        return id_opht;
    }

    /**
     * @param id_opht the id_opht to set
     */
    public void setId_opht(Short id_opht) {
        this.id_opht = id_opht;
    }

    /**
     * @return the larmoiment
     */
    public String getLarmoiment() {
        return larmoiment;
    }

    /**
     * @param larmoiment the larmoiment to set
     */
    public void setLarmoiment(String larmoiment) {
        this.larmoiment = larmoiment;
    }

    /**
     * @return the douleurO
     */
    public String getDouleurO() {
        return douleurO;
    }

    /**
     * @param douleurO the douleurO to set
     */
    public void setDouleurO(String douleurO) {
        this.douleurO = douleurO;
    }

    /**
     * @return the taches
     */
    public String getTaches() {
        return taches;
    }

    /**
     * @param taches the taches to set
     */
    public void setTaches(String taches) {
        this.taches = taches;
    }

    /**
     * @return the oeilRouge
     */
    public String getOeilRouge() {
        return oeilRouge;
    }

    /**
     * @param oeilRouge the oeilRouge to set
     */
    public void setOeilRouge(String oeilRouge) {
        this.oeilRouge = oeilRouge;
    }

    /**
     * @return the fatigue
     */
    public String getFatigue() {
        return fatigue;
    }

    /**
     * @param fatigue the fatigue to set
     */
    public void setFatigue(String fatigue) {
        this.fatigue = fatigue;
    }

    /**
     * @return the autreO
     */
    public String getAutreO() {
        return autreO;
    }

    /**
     * @param autreO the autreO to set
     */
    public void setAutreO(String autreO) {
        this.autreO = autreO;
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
