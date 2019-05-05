
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="respiratoire")
public class Respiratoire implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_resp;
    
    private String toux;
    
    private String dysnee;
    
    private String exoectorations;
    
    private String douleursT;
    
    private String tabac;
    
    private String autreR;
    
    private Short idVisite;
    
    public Respiratoire(){
        
    }

    /**
     * @return the id_resp
     */
    public Short getId_resp() {
        return id_resp;
    }

    /**
     * @param id_resp the id_resp to set
     */
    public void setId_resp(Short id_resp) {
        this.id_resp = id_resp;
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
