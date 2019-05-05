
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Examen;
import com.gestionCMT.services.ExamenServices;
import com.gestionCMT.services.ExamenServicesImpl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

@ManagedBean(name = "examenBean")
@RequestScoped
public class ExamenBean {
    
    ExamenServices exmServ = new ExamenServicesImpl();
    
    private Short idPatient;
    private List<Examen> examenList;
     
    private String img;
    
    private String typeE;
    
    private String resultatE;
    
    private String imgE;
    
    private Short id_pat;
    
    private Short idUser = 1;
    
    
    private Part uploadedFile;
    private String folder = "C:\\Users\\achour\\Documents\\NetBeansProjects\\gestionCMT\\web\\resources\\img";
 
 
    
    @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id"));    
        
         examenList = exmServ.findAll(getIdPatient());
    }
    
    public void addExam() throws IOException{
        Examen exam = new Examen();
        
        exam.setId_pat(idPatient);
        exam.setResultatE(resultatE);
        exam.setIdUser(idUser);
        exam.setTypeE(typeE);
        exam.setImgE((String) saveFile());
        
        exmServ.add(exam);
        reload();
    }
    
    public void sup(Short id) throws IOException{
        exmServ.delete(id);
        reload();
    }
    
    public void reload() throws IOException {
    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
}
    
 public Part getUploadedFile() {
 return uploadedFile;
 }
 
 public void setUploadedFile(Part uploadedFile) {
 this.uploadedFile = uploadedFile;
 }
 
 
 public String saveFile(){
     String fileName = "";
 
 try (InputStream input = uploadedFile.getInputStream()) {
 fileName = uploadedFile.getSubmittedFileName();
         Files.copy(input, new File(folder, fileName).toPath());
     }
     catch (IOException e) {
         e.printStackTrace();
     }
 return  fileName;
}
 

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
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
     * @return the examenList
     */
    public List<Examen> getExamenList() {
        return examenList;
    }

    /**
     * @param examenList the examenList to set
     */
    public void setExamenList(List<Examen> examenList) {
        this.examenList = examenList;
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