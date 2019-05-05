
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visite")
public class Visite implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_visite;
    
    private String typeV;
    
    private String dateV;
    
    private String poids;
    
    private String taille;
    
    private String urines;
    
    private String auditionOD;
    
    private String auditionOG;
    
    private String visionSCorrection;
    
    private String visionACorrection;
    
    private Short id_pat;
    
    private Short idUser;
    
    public Visite(){
        
    }

    /**
     * @return the id_visite
     */
    public Short getId_visite() {
        return id_visite;
    }

    /**
     * @param id_visite the id_visite to set
     */
    public void setId_visite(Short id_visite) {
        this.id_visite = id_visite;
    }

    /**
     * @return the typeV
     */
    public String getTypeV() {
        return typeV;
    }

    /**
     * @param typeV the typeV to set
     */
    public void setTypeV(String typeV) {
        this.typeV = typeV;
    }

    /**
     * @return the dateV
     */
    public String getDateV() {
        return dateV;
    }

    /**
     * @param dateV the dateV to set
     */
    public void setDateV(String dateV) {
        this.dateV = dateV;
    }

    /**
     * @return the poids
     */
    public String getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(String poids) {
        this.poids = poids;
    }

    /**
     * @return the taille
     */
    public String getTaille() {
        return taille;
    }

    /**
     * @param taille the taille to set
     */
    public void setTaille(String taille) {
        this.taille = taille;
    }

    /**
     * @return the urines
     */
    public String getUrines() {
        return urines;
    }

    /**
     * @param urines the urines to set
     */
    public void setUrines(String urines) {
        this.urines = urines;
    }

    /**
     * @return the auditionOD
     */
    public String getAuditionOD() {
        return auditionOD;
    }

    /**
     * @param auditionOD the auditionOD to set
     */
    public void setAuditionOD(String auditionOD) {
        this.auditionOD = auditionOD;
    }

    /**
     * @return the auditionOG
     */
    public String getAuditionOG() {
        return auditionOG;
    }

    /**
     * @param auditionOG the auditionOG to set
     */
    public void setAuditionOG(String auditionOG) {
        this.auditionOG = auditionOG;
    }

    /**
     * @return the visionSCorrection
     */
    public String getVisionSCorrection() {
        return visionSCorrection;
    }

    /**
     * @param visionSCorrection the visionSCorrection to set
     */
    public void setVisionSCorrection(String visionSCorrection) {
        this.visionSCorrection = visionSCorrection;
    }

    /**
     * @return the visionACorrection
     */
    public String getVisionACorrection() {
        return visionACorrection;
    }

    /**
     * @param visionACorrection the visionACorrection to set
     */
    public void setVisionACorrection(String visionACorrection) {
        this.visionACorrection = visionACorrection;
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

    /**
     * @return the idUser
     */
    public Short getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(Short idUser) {
        this.idUser = idUser;
    }
    
    
}
