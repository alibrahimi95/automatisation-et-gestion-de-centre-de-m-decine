
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Antecedent;
import com.gestionCMT.entity.Patient;
import com.gestionCMT.services.AntecedentServices;
import com.gestionCMT.services.AntecedentServicesImpl;
import com.gestionCMT.services.PatientServices;
import com.gestionCMT.services.PatientServicesImpl;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "patientBean")
@RequestScoped
public class PatientBean {
    
    private PatientServices patients = new PatientServicesImpl();
    private AntecedentServices antecedentserv = new AntecedentServicesImpl();
    
    private Patient p = new Patient();
    private Antecedent antec = new Antecedent();
    private List<Antecedent> antecedentList;
    
    private Short idPatient;
    
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
    
    private String typeA;
    
    private String descriptionA;
    
    private Short id_pat;
    
    private Boolean operation = true;
    
    
    
    public PatientBean(){
        
    }
    
    @PostConstruct
    public void initBean(){
        if(idPatient == null){
        FacesContext fc = FacesContext.getCurrentInstance();
        
        Map<String, String> param = fc.getExternalContext().getRequestParameterMap();
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
  Map<String, Object> sessionMap = externalContext.getSessionMap();
        if (!(param.isEmpty())) {
            if(param.get("id") != null){
           sessionMap.put("id",new Short(param.get("id")));
            }
        }
            idPatient = (Short) sessionMap.get("id");    
        }
        
        
        
        
        setP(patients.findById(idPatient));
        setAntecedentList(antecedentserv.findAll(idPatient));
        
        
    }
    
    public void showA(Short id){
        System.out.println("sshooooow");
        antec =(Antecedent) antecedentserv.findById(id);
    }
    public void editAntecedent(){
        antecedentserv.edite(getAntec());
        
    }
    public void editePatient(){
        
        patients.edite(getP());
    }
    
    public void addAntecedent(){
        Antecedent ant = new Antecedent();
        
        ant.setTypeA(typeA);
        ant.setDescriptionA(descriptionA);
        ant.setId_pat(idPatient);
        
        antecedentserv.add(ant);
        setAntecedentList(antecedentserv.findAll(idPatient));
        
    }

    /**
     * @return the idPatient
     */
    public Short getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(Short idPatient) {
        this.idPatient = idPatient;
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
     * @return the p
     */
    public Patient getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Patient p) {
        this.p = p;
    }

    /**
     * @return the antecedentList
     */
    public List<Antecedent> getAntecedentList() {
        return antecedentList;
    }

    /**
     * @param antecedentList the antecedentList to set
     */
    public void setAntecedentList(List<Antecedent> antecedentList) {
        this.antecedentList = antecedentList;
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

    /**
     * @return the operation
     */
    public Boolean getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(Boolean operation) {
        this.operation = operation;
    }

    /**
     * @return the ant
     */
    public Antecedent getAntec() {
        return antec;
    }

    /**
     * @param ant the ant to set
     */
    public void setAntec(Antecedent ant) {
        this.antec = ant;
    }
    
}
