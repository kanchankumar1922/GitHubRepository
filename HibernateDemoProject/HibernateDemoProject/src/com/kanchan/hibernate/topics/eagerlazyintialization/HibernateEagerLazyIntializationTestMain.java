/**
 * 
 */
package com.kanchan.hibernate.topics.eagerlazyintialization;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.eagerlazyintialization.AddressEagerLazy;
import com.kanchan.hibernate.topics.eagerlazyintialization.PersonEagerLazy;
import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kumark
 *
 */
public class HibernateEagerLazyIntializationTestMain {

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
	        
	       /* Person person = (Person)session.load(Person.class, 1);
	        Person person2 = (Person)session.load(Person.class, 2);
	        System.out.println("First Person Name :: " + person.getfName());
	        System.out.println("Second Person Name :: " +person2.getfName());*/
	        
	        String str = new String("name");
	        PersonEagerLazy personObj = new PersonEagerLazy();
	        personObj.setfName("EAGER");
	        personObj.setlName("PERSON");
	        personObj.setAge(30);
	        personObj.setGender("Male");
	        
	        AddressEagerLazy address1 = new AddressEagerLazy();
	        address1.setCity("PEACHTREE CITY");
	        address1.setState("GEORGIA");
	        address1.setCountry("USA");
	        address1.setHouseNo("C300");
	        address1.setStreet("450 SOUTH PEACHTREE PKWY");
	        
	        AddressEagerLazy address2 = new AddressEagerLazy();
	        address2.setCity("ATLANTA CITY");
	        address2.setState("NORTH COROLINA STATE");
	        address2.setCountry("USA");
	        address2.setHouseNo("B780");
	        address2.setStreet("650 NORTH LAWRENCE CREEK STREET");
	        
	        List<AddressEagerLazy> setOfAddresses = new ArrayList<AddressEagerLazy>();
	        setOfAddresses.add(address1);
	        setOfAddresses.add(address2);
	        
	        personObj.setSetOfAddresses(setOfAddresses);
	        
	        /*DBUser dbUser = new DBUser();
	        dbUser.setUserId("K1002");
	        dbUser.setUserName("KAMALKATTAKCH");*/

	        session.save(personObj);
	        //session.save(dbUser);
	        session.flush();
	        session.getTransaction().commit();
	        session.close();
	        
	        personObj = null;
	        session = sessionFactory.openSession();
	        personObj = (PersonEagerLazy) session.get(PersonEagerLazy.class, 1);
	        session.close();
	        System.out.println("PERSON LIST OF ADDRESSES ::: "  + personObj.getSetOfAddresses());
	        
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
