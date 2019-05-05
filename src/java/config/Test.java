package config;


import com.gestionCMT.dao.AntecedentDAO;
import com.gestionCMT.dao.AntecedentDAOImpl;
import com.gestionCMT.dao.ConsultationDAO;
import com.gestionCMT.dao.ConsultationDAOImpl;
import com.gestionCMT.dao.TraitementDAO;
import com.gestionCMT.dao.TraitementDAOImpl;
import com.gestionCMT.dao.UsersDAO;
import com.gestionCMT.dao.UsersDAOImpl;
import com.gestionCMT.entity.Antecedent;
import com.gestionCMT.entity.Consultation;
import com.gestionCMT.entity.Examen;
import com.gestionCMT.entity.Patient;
import com.gestionCMT.entity.Traitement;
import com.gestionCMT.entity.Users;
import com.gestionCMT.services.AntecedentServices;
import com.gestionCMT.services.AntecedentServicesImpl;
import com.gestionCMT.services.ConsultationServices;
import com.gestionCMT.services.ConsultationServicesImpl;
import com.gestionCMT.services.ExamenServices;
import com.gestionCMT.services.ExamenServicesImpl;
import com.gestionCMT.services.PatientServices;
import com.gestionCMT.services.PatientServicesImpl;
import com.gestionCMT.services.TraitementServices;
import com.gestionCMT.services.TraitementServicesImpl;
import com.gestionCMT.services.UsersServices;
import com.gestionCMT.services.UsersServicesImp;
import java.util.List;
import org.hibernate.Session;

public class Test {
    static Session session = HibernateUtil.openSession();
    
    
    public static void main(String[] args){
        Short id = 1;
       /* UsersServices dao =new UsersServicesImp();
        String p ="achour";
        String pw = "azerty";
        List<Users> list = dao.findAll(p, pw);
        System.out.println(list.get(0).getNom());
        */
        /*ExamenServices dao = new ExamenServicesImpl();
        for(Examen o:dao.findAll(id)){
            System.out.println(o.getTypeE());
        }*/
        /*
        TraitementServices dao = new TraitementServicesImpl();
        for(Traitement o:dao.findAll(id)){
            System.out.println(o.getTypeT());
        }*/
       /* ConsultationServices cons = new ConsultationServicesImpl();
        ConsultationDAO dao = new ConsultationDAOImpl();
        Consultation consl = new Consultation();
        consl.setId_consult(id);
        consl.setTypeC("tyyyyyype");
        consl.setDateC("dateC");
        consl.setIdUser(id);
        consl.setId_pat(id);
        consl.setMotifC("motifC");
        consl.setObservation("observation");
        consl.setTraitement("traitement");
        cons.edite(consl);*/
       // session.createQuery("select o from Users o").list();
       /*AntecedentServices serv = new AntecedentServicesImpl();
       System.out.println(serv.findById(id).getTypeA());
       AntecedentDAO dao = new AntecedentDAOImpl();
       
       Short id = 1;
        List<Antecedent> list = session.createQuery("select o from Antecedent o where id_pat ="+id+"  ").list();
        for(Antecedent o:dao.findAll(id)){
            System.out.println(o.getTypeA());
        }*/
        /* UsersDAO dao = new UsersDAOImpl();
        Users user = new Users();
        user.setNom("nom");
        user.setPassword("password");
        user.setPrenom("prenom");
        user.setPseudo("pseudo");
        user.setType_user("type_user");
        System.out.println("ajouter");
        //dao.add(user);
        Short i = 2;
        dao.delete(i);*/ /*
        PatientServices ser = new PatientServicesImpl();
        Patient p = new Patient();
        p.setAdresse("adresse");
        p.setAptitudeT("aptitudeT");
        p.setDateNaissance("dateNaissance");
        p.setFormation("formation");
        p.setLieuNaissance("lieuNaissance");
        p.setNomP("nomP");
        p.setNumSecSoc("numSecSoc");
        p.setPrenomP("prenomP");
        p.setServN("servN");
        p.setServiceT("serviceT");
        p.setSexe("sexe");
        p.setSfamiliale("sfamiliale");
        ser.add(p);*/
        
        
        
    }
    
}
