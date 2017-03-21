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
public class Main implements SessionFactoryProvider {

    public static Session session;
    public static Transaction transaction;
    public static User user;

    public static void main(String[] args) {

        session = SESSION_FACTORY.openSession();
        try {

            transaction = session.beginTransaction();

            user = new User();
            user.setUserId(6L);
            user.setUserName("Updated_Username_6");
            user.setPassword("Updated_Password_6");
            
            session.update(user);

            transaction.commit();

        } catch (Exception e) {

            transaction.rollback();
            System.out.println(e.toString());

        } finally {

            session.close();
        }

        SESSION_FACTORY.close();

        if (user != null) {

            System.out.println("User Id : " + user.getUserId());
            System.out.println("User Name : " + user.getUserName());
            System.out.println("User Pass : " + user.getPassword());
        }
    }

}
