
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Traitement;
import com.gestionCMT.services.TraitementServices;
import com.gestionCMT.services.TraitementServicesImpl;
import com.gestionCMT.services.UsersServices;
import com.gestionCMT.services.UsersServicesImp;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "traitementBean")
@RequestScoped
public class TraitementBean {
    TraitementServices traitserv = new TraitementServicesImpl();
    UsersServices userServ = new UsersServicesImp();
    private List<Traitement> traitList;
    private Short idPatient;
    
    private Traitement trt = new Traitement();
    
    private String typeT;
    
    private String dateT;
    
    private Short id_pat;
    
    private Short idUser;
    
    
    
    @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id")); 
         
         idUser = (Short) sessionMap.get("iduser");

        
         traitList = traitserv.findAll(getIdPatient());
    }
     public String NomMed(Short id){
        return userServ.findById(id).getNom() + "  "+ userServ.findById(id).getPrenom();
    }
    
    public void addTrait(){
        Traitement trait = new Traitement();
        
        trait.setTypeT(typeT);
        trait.setDateT(dateT);
        trait.setId_pat(idPatient);
        trait.setIdUser(idUser);
        
        traitserv.add(trait);
        traitList = traitserv.findAll(getIdPatient());    
    }
    
    public void showT(Short id){
        trt = (Traitement) traitserv.findById(id);
    }
    public void editer(){
        trt = (Traitement) getTrt();
        traitserv.edite(trt);
    }

    /**
     * @return the traitList
     */
    public List<Traitement> getTraitList() {
        return traitList;
    }

    /**
     * @param traitList the traitList to set
     */
    public void setTraitList(List<Traitement> traitList) {
        this.traitList = traitList;
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
     * @return the typeT
     */
    public String getTypeT() {
        return typeT;
    }

    /**
     * @param typeT the typeT to set
     */
    public void setTypeT(String typeT) {
        this.typeT = typeT;
    }

    /**
     * @return the dateT
     */
    public String getDateT() {
        return dateT;
    }

    /**
     * @param dateT the dateT to set
     */
    public void setDateT(String dateT) {
        this.dateT = dateT;
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
     * @return the trt
     */
    public Traitement getTrt() {
        return trt;
    }

    /**
     * @param trt the trt to set
     */
    public void setTrt(Traitement trt) {
        this.trt = trt;
    }
}
