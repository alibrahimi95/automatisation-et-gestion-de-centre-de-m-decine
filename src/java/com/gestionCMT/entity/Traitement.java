
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traitement")
public class Traitement implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_trait;
    
    private String typeT;
    
    private String dateT;
    
    private Short id_pat;
    
    private Short idUser;
    
    public Traitement(){
        
    }

    /**
     * @return the id_trait
     */
    public Short getId_trait() {
        return id_trait;
    }

    /**
     * @param id_trait the id_trait to set
     */
    public void setId_trait(Short id_trait) {
        this.id_trait = id_trait;
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
    
}
