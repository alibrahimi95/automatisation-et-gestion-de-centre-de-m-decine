
package com.gestionCMT.dao;

import com.gestionCMT.entity.Users;
import config.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class UsersDAOImpl implements UsersDAO {
    
    Session session = HibernateUtil.openSession();

    @Override
    public void add(Users e) {
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }

    @Override
    public Users edite(Users e) {
        session.beginTransaction();
        Users u = (Users) session.merge(e);
        session.getTransaction().commit();
        return u;
    }

    @Override
    public void delete(Short id) {
        session.beginTransaction();
        Users u = findById(id);
        session.delete(u);
        session.getTransaction().commit();
    }

    @Override
    public List<Users> findAll(String pseudo, String pass) {
        Query query = session.createQuery("select o from Users o where pseudo=:pseudo and password=:password");
        query.setString("pseudo", pseudo);
      query.setString("password", pass);
      return query.list();
    }

    @Override
    public Users findById(Short id) {
           return (Users) session.get(Users.class, id);
    }
    
}
