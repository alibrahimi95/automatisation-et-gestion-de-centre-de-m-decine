
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Patient;
import com.gestionCMT.services.PatientServices;
import com.gestionCMT.services.PatientServicesImpl;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "patientTBean")
@RequestScoped
public class PatientTBean {
    
    private PatientServices patients = new PatientServicesImpl();
    
    private List<Patient> patientList;
    
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
    
    private List messages;
    
    private boolean errorM;
    @PostConstruct
    public void initBean(){
             
        setPatientList(patients.findAll());
    }

    /**
     * @return the patientList
     */
    public List<Patient> getPatientList() {
        return patientList;
    }
    
    public void addPatient(){
        Patient p = new Patient();
        
        p.setAdresse(adresse);
        p.setAptitudeT(aptitudeT);
        p.setDateNaissance(dateNaissance);
        p.setFormation(formation);
        p.setLieuNaissance(lieuNaissance);
        p.setNomP(nomP);
        p.setNumSecSoc(numSecSoc);
        p.setPrenomP(prenomP);
        p.setServN(servN);
        p.setServiceT(serviceT);
        p.setSexe(sexe);
        p.setSfamiliale(sfamiliale);
        
        patients.add(p);
        
        setPatientList(patients.findAll());
    }

    /**
     * @param patientList the patientList to set
     */
    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
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

    /**
     * @return the messages
     */
    public List getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(List messages) {
        this.messages = messages;
    }

    /**
     * @return the errorM
     */
    public boolean isErrorM() {
        return errorM;
    }

    /**
     * @param errorM the errorM to set
     */
    public void setErrorM(boolean errorM) {
        this.errorM = errorM;
    }
    
}
