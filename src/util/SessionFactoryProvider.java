/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author ashif
 */
public interface SessionFactoryProvider {
    
    public static final SessionFactory SESSION_FACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
}
