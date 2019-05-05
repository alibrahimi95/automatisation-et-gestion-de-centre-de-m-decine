
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Consultation;
import com.gestionCMT.services.ConsultationServices;
import com.gestionCMT.services.ConsultationServicesImpl;
import com.gestionCMT.services.UsersServices;
import com.gestionCMT.services.UsersServicesImp;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionListener;

@ManagedBean(name = "consultationBean")
@RequestScoped
public class ConsultationBean {
    ConsultationServices consultServ = new ConsultationServicesImpl();
        UsersServices userServ = new UsersServicesImp();

    
    private List<Consultation> consultList;
    private Consultation consult = new Consultation();
    
    private Short idPatient;
    
    private String typeC;
    
    private String motifC;
    
    private String observation;
    
    private String traitement;
    
    private String dateC;
    
    private Short id_pat;
    
    private Short idUser ;
    
    private boolean show = false;
    
    @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id")); 
         
         idUser = (Short) sessionMap.get("iduser");
        
         consultList = consultServ.findAll(idPatient);
    }
    public String NomMed(Short id){
        return userServ.findById(id).getNom() + "  "+ userServ.findById(id).getPrenom();
    }
    public void editer(){
        consult = (Consultation) getConsult();
        
        consultServ.edite(consult);
        
    }
    
    public void addConsult(){
        System.out.println("dfdfhhhhhhhhhhhhhh");

       Consultation cons = new Consultation();
       
       cons.setDateC(dateC);
       cons.setIdUser(idUser);
       cons.setId_pat(idPatient);
       cons.setMotifC(motifC);
       cons.setTraitement(traitement);
       cons.setObservation(observation);
       cons.setTypeC(typeC);
       
       consultServ.add(cons);
       consultList = consultServ.findAll(idPatient);
    }
    public void showM(Short id){
        consult =(Consultation) consultServ.findById(id);
        
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
     * @return the consultList
     */
    public List<Consultation> getConsultList() {
        return consultList;
    }

    /**
     * @param consultList the consultList to set
     */
    public void setConsultList(List<Consultation> consultList) {
        this.consultList = consultList;
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

    /**
     * @return the consult
     */
    public Consultation getConsult() {
        return consult;
    }

    /**
     * @param consult the consult to set
     */
    public void setConsult(Consultation consult) {
        this.consult = consult;
    }

    /**
     * @return the show
     */
    public boolean isShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(boolean show) {
        this.show = show;
    }
}
