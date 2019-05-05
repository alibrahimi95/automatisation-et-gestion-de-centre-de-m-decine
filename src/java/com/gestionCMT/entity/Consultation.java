
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consultation")
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_consult;
    
    private String typeC;
    
    private String motifC;
    
    private String observation;
    
    private String traitement;
    
    private String dateC;
    
    private Short id_pat;
    
    private Short idUser;
    
    public Consultation(){
        
    }

    /**
     * @return the id_consult
     */
    public Short getId_consult() {
        return id_consult;
    }

    /**
     * @param id_consult the id_consult to set
     */
    public void setId_consult(Short id_consult) {
        this.id_consult = id_consult;
    }

    /**
     * @return the typeC
     */
    public String getTypeC() {
        return typeC;
    }

    /**
     * @param typeC the typeC to set
     */
    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    /**
     * @return the motifC
     */
    public String getMotifC() {
        return motifC;
    }

    /**
     * @param motifC the motifC to set
     */
    public void setMotifC(String motifC) {
        this.motifC = motifC;
    }

    /**
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * @return the traitement
     */
    public String getTraitement() {
        return traitement;
    }

    /**
     * @param traitement the traitement to set
     */
    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }

    /**
     * @return the dateC
     */
    public String getDateC() {
        return dateC;
    }

    /**
     * @param dateC the dateC to set
     */
    public void setDateC(String dateC) {
        this.dateC = dateC;
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
