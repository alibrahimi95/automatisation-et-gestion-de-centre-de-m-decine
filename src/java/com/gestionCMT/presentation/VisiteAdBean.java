
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Locomoteur;
import com.gestionCMT.entity.Opht;
import com.gestionCMT.entity.Orl;
import com.gestionCMT.entity.Respiratoire;
import com.gestionCMT.entity.Users;
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
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "visiteAdBean")
@RequestScoped
public class VisiteAdBean {
    
    
    VisiteServices visiteServ = new VisiteServicesImpl();
    OphtServices ophtServ = new OphtServicesImpl();
    OrlServices orlServ = new OrlServicesImpl();
    LocomoteurServices locServ = new LocomoteurServicesImpl();
    RespiratoireServices respServ = new RespiratoireServicesImpl();
    
    
    //champs de la classe visite
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
    
    //champs OPHT
    
     private String larmoiment;
    
    private String douleurO;
    
    private String taches;
    
    private String oeilRouge;
    
    private String fatigue;
    
    private String autreO;
    
    private Short idVisite;
    
    //champs ORL
    
    private String sifflement;
    
    private String engines;
    
    private String epistaxis;
    
    private String entendMal;
    
    private String otorrhees;
    
    private String eternument;
    
    private String rhinorrhee;
    
    private String autreOrl;
    
    //champs Locomoteur
     private String douleurL;
    
    private String géneM;
    
    private String fatigabilité;
    
    private String autreLoc;
   
    //champs respiratoire
    private String toux;
    
    private String dysnee;
    
    private String exoectorations;
    
    private String douleursT;
    
    private String tabac;
    
    private String autreR;
   
    
    private Short idPatient;
    private List<Visite> visitelist;
    
    @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id"));   
        
        idUser = (Short) sessionMap.get("iduser");
    }
    
    public void addvisite(){
        Visite visite = new Visite();
        visite.setTypeV(typeV);
        visite.setDateV(dateV);
        visite.setPoids(poids);
        visite.setTaille(taille);
        visite.setUrines(urines);
        visite.setAuditionOD(auditionOD);
        visite.setAuditionOG(auditionOG);
        visite.setVisionACorrection(visionACorrection);
        visite.setVisionSCorrection(visionSCorrection);
        visite.setId_pat(idPatient);
        visite.setIdUser(idUser);
        
        visiteServ.add(visite);
        visitelist = visiteServ.findAll(idPatient);
        idVisite = visitelist.get(visitelist.size() - 1).getId_visite();
        this.addOpht();
        this.addOrl();
        this.addLoc();
        this.addResp();
        
        
        
    }
    public void addOpht(){
        Opht opht = new Opht();
        opht.setAutreO(autreO);
        opht.setDouleurO(douleurO);
        opht.setFatigue(fatigue);
        opht.setIdVisite(idVisite);
        opht.setLarmoiment(larmoiment);
        opht.setOeilRouge(oeilRouge);
        opht.setTaches(taches);
        
        ophtServ.add(opht);
    }
    
    public void addOrl(){
        Orl orl = new Orl();
        orl.setAutreOrl(autreOrl);
        orl.setEngines(engines);
        orl.setEntendMal(entendMal);
        orl.setEpistaxis(epistaxis);
        orl.setEternument(eternument);
        orl.setIdVisite(idVisite);
        orl.setOtorrhees(otorrhees);
        orl.setRhinorrhee(rhinorrhee);
        orl.setSifflement(sifflement);
        
        orlServ.add(orl);
    }
    
    public void addLoc(){
        Locomoteur loc = new Locomoteur();
        loc.setAutreLoc(autreLoc);
        loc.setDouleurL(douleurL);
        loc.setFatigabilité(fatigabilité);
        loc.setGéneM(géneM);
        loc.setIdVisite(idVisite);
        
        locServ.add(loc);
    }
    
    public void addResp(){
        Respiratoire resp = new Respiratoire();
        resp.setAutreR(autreR);
        resp.setDouleursT(douleursT);
        resp.setDysnee(dysnee);
        resp.setExoectorations(exoectorations);
        resp.setIdVisite(idVisite);
        resp.setTabac(tabac);
        resp.setToux(toux);
        
        respServ.add(resp);
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
     * @return the douleurL
     */
    public String getDouleurL() {
        return douleurL;
    }

    /**
     * @param douleurL the douleurL to set
     */
    public void setDouleurL(String douleurL) {
        this.douleurL = douleurL;
    }

    /**
     * @return the géneM
     */
    public String getGéneM() {
        return géneM;
    }

    /**
     * @param géneM the géneM to set
     */
    public void setGéneM(String géneM) {
        this.géneM = géneM;
    }

    /**
     * @return the fatigabilité
     */
    public String getFatigabilité() {
        return fatigabilité;
    }

    /**
     * @param fatigabilité the fatigabilité to set
     */
    public void setFatigabilité(String fatigabilité) {
        this.fatigabilité = fatigabilité;
    }

    /**
     * @return the autreLoc
     */
    public String getAutreLoc() {
        return autreLoc;
    }

    /**
     * @param autreLoc the autreLoc to set
     */
    public void setAutreLoc(String autreLoc) {
        this.autreLoc = autreLoc;
    }

    /**
     * @return the toux
     */
    public String getToux() {
        return toux;
    }

    /**
     * @param toux the toux to set
     */
    public void setToux(String toux) {
        this.toux = toux;
    }

    /**
     * @return the dysnee
     */
    public String getDysnee() {
        return dysnee;
    }

    /**
     * @param dysnee the dysnee to set
     */
    public void setDysnee(String dysnee) {
        this.dysnee = dysnee;
    }

    /**
     * @return the exoectorations
     */
    public String getExoectorations() {
        return exoectorations;
    }

    /**
     * @param exoectorations the exoectorations to set
     */
    public void setExoectorations(String exoectorations) {
        this.exoectorations = exoectorations;
    }

    /**
     * @return the douleursT
     */
    public String getDouleursT() {
        return douleursT;
    }

    /**
     * @param douleursT the douleursT to set
     */
    public void setDouleursT(String douleursT) {
        this.douleursT = douleursT;
    }

    /**
     * @return the tabac
     */
    public String getTabac() {
        return tabac;
    }

    /**
     * @param tabac the tabac to set
     */
    public void setTabac(String tabac) {
        this.tabac = tabac;
    }

    /**
     * @return the autreR
     */
    public String getAutreR() {
        return autreR;
    }

    /**
     * @param autreR the autreR to set
     */
    public void setAutreR(String autreR) {
        this.autreR = autreR;
    }
    
}
