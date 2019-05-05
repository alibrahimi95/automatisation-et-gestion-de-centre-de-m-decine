
package com.gestionCMT.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="examen")
public class Examen implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_examen;
    
    private String typeE;
    
    private String resultatE;
    
    private String imgE;
    
    private Short id_pat;
    
    private Short idUser;
    
    public Examen(){
        
    }

    /**
     * @return the id_examen
     */
    public Short getId_examen() {
        return id_examen;
    }

    /**
     * @param id_examen the id_examen to set
     */
    public void setId_examen(Short id_examen) {
        this.id_examen = id_examen;
    }

    /**
     * @return the typeE
     */
    public String getTypeE() {
        return typeE;
    }

    /**
     * @param typeE the typeE to set
     */
    public void setTypeE(String typeE) {
        this.typeE = typeE;
    }

    /**
     * @return the resultatE
     */
    public String getResultatE() {
        return resultatE;
    }

    /**
     * @param resultatE the resultatE to set
     */
    public void setResultatE(String resultatE) {
        this.resultatE = resultatE;
    }

    /**
     * @return the imgE
     */
    public String getImgE() {
        return imgE;
    }

    /**
     * @param imgE the imgE to set
     */
    public void setImgE(String imgE) {
        this.imgE = imgE;
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
