package com.strut.strutstut.dao;

import com.strut.strutstut.models.User;
import com.strut.strutstut.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAO {

    public User save(User user){
        Session session = HibernateUtils.currentSession();
        Transaction tx = null;
        boolean rollback = true;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(user);
            tx.commit();
            rollback = false;
        }
        catch (Exception e){
            System.err.println("Error creating User :" + e.getMessage());
        }
        finally {
            if( rollback && tx != null){
                tx.rollback();
            }
            HibernateUtils.closeSession();
        }
        return user;
    }

    public void deleteUserById(Integer id){
        User user = null;
        Transaction tx = null;
        boolean rollback = true;
        try {
            Session session = HibernateUtils.currentSession();
            tx = session.beginTransaction();
            user = session.get(User.class, id);
            session.delete(user);
            tx.commit();
            rollback = false;
        }
        catch (Exception e){
            System.err.println("Error delete User : " + e.getMessage());
        }
        finally {
            if(rollback && tx != null){
                tx.rollback();
            }
            HibernateUtils.closeSession();
        }
    }

    public List<User> readAll(){
        Session session = HibernateUtils.currentSession();
        List<User> listUser = null;
        try {
            listUser = session.createQuery("from User").list();
        } catch(Exception e){
            System.err.println("Error view Users :" + e.getMessage());
        }
        finally {
            HibernateUtils.closeSession();
        }
        return listUser;
    }

    public List<User> saveAndReadAll(User user){
        Session session = HibernateUtils.currentSession();
        Transaction tx = null;
        boolean rollback = true;
        List<User> listUser = null;
        try {
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            listUser = session.createQuery("from User").list();
            rollback = false;
        }
        catch (Exception e){
            System.err.println("Error creating User :" + e.getMessage());
        }
        finally {
            if( rollback && tx != null){
                tx.rollback();
            }
            HibernateUtils.closeSession();
        }
        return listUser;
    }


}
