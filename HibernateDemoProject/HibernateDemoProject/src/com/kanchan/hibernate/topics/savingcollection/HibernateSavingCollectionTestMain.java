/**
 * 
 */
package com.kanchan.hibernate.topics.savingcollection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.savingcollection.AddressCollection;
import com.kanchan.hibernate.topics.savingcollection.PersonCollection;
import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kumark
 *
 */
public class HibernateSavingCollectionTestMain {

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
	        PersonCollection obj = new PersonCollection();
	        obj.setfName("Aqif2");
	        obj.setlName("Hamid2");
	        obj.setAge(25);
	        obj.setGender("Male");
	        
	        AddressCollection address1 = new AddressCollection();
	        address1.setCity("PEACHTREE CITY");
	        address1.setState("GEORGIA");
	        address1.setCountry("USA");
	        address1.setHouseNo("C300");
	        address1.setStreet("450 SOUTH PEACHTREE PKWY");
	        
	        AddressCollection address2 = new AddressCollection();
	        address2.setCity("ATLANTA CITY");
	        address2.setState("NORTH COROLINA STATE");
	        address2.setCountry("USA");
	        address2.setHouseNo("B780");
	        address2.setStreet("650 NORTH LAWRENCE CREEK STREET");
	        
	        List<AddressCollection> setOfAddresses = new ArrayList<AddressCollection>();
	        setOfAddresses.add(address1);
	        setOfAddresses.add(address2);
	        
	        obj.setSetOfAddresses(setOfAddresses);
	        
	        /*DBUser dbUser = new DBUser();
	        dbUser.setUserId("K1002");
	        dbUser.setUserName("KAMALKATTAKCH");*/

	        session.save(obj);
	        //session.save(dbUser);
	        session.flush();
	        session.getTransaction().commit();
	        session.close();
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
