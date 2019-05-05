
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_patient;
    
    private String nomP;
    
    private String prenomP;
    
    private String sexe;
    
    private String dateNaissance;
    
    private String lieuNaissance;
    
    private String adresse;
    
    private String sfamiliale;
    
    private String numSecSoc;
    
    private String servN;
    
    private String serviceT;
    
    private String formation;
    
    private String aptitudeT;
   
    public Patient(){
        
    }

    /**
     * @return the id_patient
     */
    public Short getId_patient() {
        return id_patient;
    }

    /**
     * @param id_patient the id_patient to set
     */
    public void setId_patient(Short id_patient) {
        this.id_patient = id_patient;
    }

    /**
     * @return the nomP
     */
    public String getNomP() {
        return nomP;
    }

    /**
     * @param nomP the nomP to set
     */
    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    /**
     * @return the prenomP
     */
    public String getPrenomP() {
        return prenomP;
    }

    /**
     * @param prenomP the prenomP to set
     */
    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the dateNaissance
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return the lieuNaissance
     */
    public String getLieuNaissance() {
        return lieuNaissance;
    }

    /**
     * @param lieuNaissance the lieuNaissance to set
     */
    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the sfamiliale
     */
    public String getSfamiliale() {
        return sfamiliale;
    }

    /**
     * @param sfamiliale the sfamiliale to set
     */
    public void setSfamiliale(String sfamiliale) {
        this.sfamiliale = sfamiliale;
    }

    /**
     * @return the numSecSoc
     */
    public String getNumSecSoc() {
        return numSecSoc;
    }

    /**
     * @param numSecSoc the numSecSoc to set
     */
    public void setNumSecSoc(String numSecSoc) {
        this.numSecSoc = numSecSoc;
    }

    /**
     * @return the servN
     */
    public String getServN() {
        return servN;
    }

    /**
     * @param servN the servN to set
     */
    public void setServN(String servN) {
        this.servN = servN;
    }

    /**
     * @return the serviceT
     */
    public String getServiceT() {
        return serviceT;
    }

    /**
     * @param serviceT the serviceT to set
     */
    public void setServiceT(String serviceT) {
        this.serviceT = serviceT;
    }

    /**
     * @return the formation
     */
    public String getFormation() {
        return formation;
    }

    /**
     * @param formation the formation to set
     */
    public void setFormation(String formation) {
        this.formation = formation;
    }

    /**
     * @return the aptitudeT
     */
    public String getAptitudeT() {
        return aptitudeT;
    }

    /**
     * @param aptitudeT the aptitudeT to set
     */
    public void setAptitudeT(String aptitudeT) {
        this.aptitudeT = aptitudeT;
    }
    
}
