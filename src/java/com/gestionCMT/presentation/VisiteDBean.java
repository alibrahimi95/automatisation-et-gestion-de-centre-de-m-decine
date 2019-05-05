
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Locomoteur;
import com.gestionCMT.entity.Opht;
import com.gestionCMT.entity.Orl;
import com.gestionCMT.entity.Respiratoire;
import com.gestionCMT.entity.Visite;
import com.gestionCMT.services.LocomoteurServices;
import com.gestionCMT.services.LocomoteurServicesImpl;
import com.gestionCMT.services.OphtServices;
import com.gestionCMT.services.OphtServicesImpl;
import com.gestionCMT.services.OrlServices;
import com.gestionCMT.services.OrlServicesImpl;
import com.gestionCMT.services.RespiratoireServices;
import com.gestionCMT.services.RespiratoireServicesImpl;
import com.gestionCMT.services.VisiteServices;
import com.gestionCMT.services.VisiteServicesImpl;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "visiteDBean")
@RequestScoped
public class VisiteDBean {
    
    VisiteServices visiteServ = new VisiteServicesImpl();
    OphtServices ophtServ = new OphtServicesImpl();
    OrlServices orlServ = new OrlServicesImpl();
    LocomoteurServices locServ = new LocomoteurServicesImpl();
    RespiratoireServices respServ = new RespiratoireServicesImpl();
    
    
    private Visite visite = new Visite();
    private Opht opht = new Opht();
    private Orl orl = new Orl();
    private Locomoteur loc = new Locomoteur();
    private Respiratoire resp = new Respiratoire();
    
    private Short idPatient;
    private Short idVisite;
    
    @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id"));   
         if(idVisite == null){
         Map<String, String> param = externalContext.getRequestParameterMap();
         if (!(param.isEmpty())) {
            if(param.get("idV") != null){
           sessionMap.put("idV",new Short(param.get("idV")));
           //idVisite = new Short(param.get("idV"));
            }
        }
            idVisite = (Short) sessionMap.get("idV");  
        
         }
         
         visite = visiteServ.findById(idVisite);
         setOpht((Opht) ophtServ.findAll(idVisite).get(0));
         orl = (Orl) orlServ.findAll(idVisite).get(0);
         loc = (Locomoteur) locServ.findAll(idVisite).get(0);
         resp = (Respiratoire) respServ.findAll(idVisite).get(0);
    }
    
    public void editeVisite(){
        visiteServ.edite(visite);
    }
    
    public void editeOpht(){
        ophtServ.edite(opht);
    }
    
    public void editeOrl(){
        orlServ.edite(orl);
    }
    
    public void editeLoc(){
        locServ.edite(loc);
    }
    
    public void editeResp(){
        respServ.edite(resp);
    }
    

    /**
     * @return the visite
     */
    public Visite getVisite() {
        return visite;
    }

    /**
     * @param visite the visite to set
     */
    public void setVisite(Visite visite) {
        this.visite = visite;
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

    /**
     * @return the opht
     */
    public Opht getOpht() {
        return opht;
    }

    /**
     * @param opht the opht to set
     */
    public void setOpht(Opht opht) {
        this.opht = opht;
    }

    /**
     * @return the orl
     */
    public Orl getOrl() {
        return orl;
    }

    /**
     * @param orl the orl to set
     */
    public void setOrl(Orl orl) {
        this.orl = orl;
    }

    /**
     * @return the loc
     */
    public Locomoteur getLoc() {
        return loc;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(Locomoteur loc) {
        this.loc = loc;
    }

    /**
     * @return the resp
     */
    public Respiratoire getResp() {
        return resp;
    }

    /**
     * @param resp the resp to set
     */
    public void setResp(Respiratoire resp) {
        this.resp = resp;
    }
}
