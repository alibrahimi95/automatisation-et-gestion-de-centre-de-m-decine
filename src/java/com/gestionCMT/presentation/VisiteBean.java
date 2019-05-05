
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Visite;
import com.gestionCMT.services.UsersServices;
import com.gestionCMT.services.UsersServicesImp;
import com.gestionCMT.services.VisiteServices;
import com.gestionCMT.services.VisiteServicesImpl;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "visiteBean")
@RequestScoped
public class VisiteBean {
    VisiteServices visiteServ = new VisiteServicesImpl();
    UsersServices userServ = new UsersServicesImp();
    
    private List<Visite> visiteList;
    
    private Short idPatient;
    
     @PostConstruct
    public void initBean(){
         ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
         Map<String, Object> sessionMap = externalContext.getSessionMap();
         setIdPatient((Short) sessionMap.get("id"));    
        
         visiteList = visiteServ.findAll(getIdPatient());
    }
    
    public String NomMed(Short id){
        return userServ.findById(id).getNom() + "  "+ userServ.findById(id).getPrenom();
    }

    /**
     * @return the visiteList
     */
    public List<Visite> getVisiteList() {
        return visiteList;
    }

    /**
     * @param visiteList the visiteList to set
     */
    public void setVisiteList(List<Visite> visiteList) {
        this.visiteList = visiteList;
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
    
    
    
}
