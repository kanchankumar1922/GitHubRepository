/**
 * 
 */
package com.kanchan.hibernate.topics.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kumark
 *
 */
public class HibernateInheritanceTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        
	        System.out.println("sessionFactory ::: " + sessionFactory);
	        session = sessionFactory.openSession();
	        session.beginTransaction();
	        
	        for(int i = 0 ; i < 10 ; i++){
	        	PersonHql personHql = new PersonHql();
	        	personHql.setfName("HQL USER FN");
	        	session.save(personHql);
	        }
	        
	        Query query = session.createQuery("from hql.Person where id > 5");
	        @SuppressWarnings("unchecked")
			List<PersonHql> listPersonHql = (List<PersonHql>) query.list();
	        System.out.println(listPersonHql.size());
	       
	        //session.flush();
	        session.getTransaction().commit();
	        session.close();
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
