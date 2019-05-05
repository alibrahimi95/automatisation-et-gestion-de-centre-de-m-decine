
package com.gestionCMT.presentation;

import com.gestionCMT.entity.Users;
import com.gestionCMT.services.UsersServices;
import com.gestionCMT.services.UsersServicesImp;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "usersBean")
@SessionScoped
public class UsersBean implements Serializable {
    
    UsersServices userServ = new UsersServicesImp();
    List<Users> userList;
    private Users user = new Users();
    private String pseudo;
    
    private String password;
    
    private String type_user;
    
    private String nom;
    
    private String prenom;
    
    private boolean active;
    private boolean show;
    private boolean showC;
    private boolean showV;
    
    public void check() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        userList = userServ.findAll(pseudo, password);
        if(userList.size()==1){
            
            context.getExternalContext().getSessionMap().put("user", "user");
            user.setId_user(userList.get(0).getId_user());
            user.setNom(userList.get(0).getNom());
            user.setPrenom(userList.get(0).getPrenom());
            user.setType_user(userList.get(0).getType_user());
            if(userList.get(0).getType_user().equals("i")){
                show = false;
                showC = false;
                showV = false;
            }
            if(userList.get(0).getType_user().equals("mg")){
                show = true;
                showC = true;
                showV = false;
            }
            if(userList.get(0).getType_user().equals("ms")){
                show = true;
                showC = false;
                showV = true;
            }
            active = true;
            context.getExternalContext().getSessionMap().put("iduser",userList.get(0).getId_user());

            context.getExternalContext().redirect("listPatient.xhtml");
      }else{
            context.addMessage(null, new FacesMessage("Veuillez choisir un autre pseudo ou mot de passe."));

            
      }
        
    }
    
     public void logout() {
     	FacesContext context = FacesContext.getCurrentInstance();
     	context.getExternalContext().invalidateSession();
         try {
 context.getExternalContext().redirect("index.xhtml");
 } catch (IOException e) {
 e.printStackTrace();
 }
     }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type_user
     */
    public String getType_user() {
        return type_user;
    }

    /**
     * @param type_user the type_user to set
     */
    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the user
     */
    public Users getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Users user) {
        this.user = user;
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

    /**
     * @return the showC
     */
    public boolean isShowC() {
        return showC;
    }

    /**
     * @param showC the showC to set
     */
    public void setShowC(boolean showC) {
        this.showC = showC;
    }

    /**
     * @return the showV
     */
    public boolean isShowV() {
        return showV;
    }

    /**
     * @param showV the showV to set
     */
    public void setShowV(boolean showV) {
        this.showV = showV;
    }
    
}
