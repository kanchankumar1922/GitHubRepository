/**
 * 
 */
package com.kanchan.hibernate.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author kumark
 *
 */
public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	private static final SessionFactory buildSessionFactory(){
		
		try{
			return new Configuration().configure().buildSessionFactory();
		}catch(HibernateException he){
			System.err.println("HibernateException occured " + he);
			throw new ExceptionInInitializerError(he);
		}catch(Exception e){
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}		
	}
	
	public static SessionFactory getSessionFactory(){
		return SESSION_FACTORY;
	}

}
