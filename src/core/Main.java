/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import database.models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryProvider;

/**
 *
 * @author ashif
 */
public class Main implements SessionFactoryProvider{
    
    public static Session session ;
    public static Transaction transaction ; 
    
    public static void main(String[] args) {
        
        User user1 = new User();
        user1.setUserName("Ashif");
        user1.setPassword("Ashif123");
        
        User user2 = new User();
        user2.setUserName("Arif");
        user2.setPassword("Arif123");
        
        session = SESSION_FACTORY.openSession();
        try {
            
            transaction = session.beginTransaction();
            
            session.save(user1);
            session.save(user2);
            
            transaction.commit();
            
            
        } catch (Exception e) {
            
            transaction.rollback();
            throw new ExceptionInInitializerError(e);
        
        } finally{
            
            session.close();
        }
        
        SESSION_FACTORY.close();
    }
    
}
