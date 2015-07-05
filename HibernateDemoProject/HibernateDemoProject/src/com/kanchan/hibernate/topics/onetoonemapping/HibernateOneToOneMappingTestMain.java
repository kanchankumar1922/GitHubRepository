/**
 * 
 */
package com.kanchan.hibernate.topics.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.onetoonemapping.PersonOneToOne;
import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kumark
 *
 */
public class HibernateOneToOneMappingTestMain {

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
	        
	        PersonOneToOne personObj = new PersonOneToOne();
	        personObj.setfName("CAR GIRL");
	        personObj.setlName("GIRL CAR");
	        personObj.setAge(100);
	        personObj.setGender("FEMALE");
	        
	        VehicleOneToOne vehicle = new VehicleOneToOne();
	        //vehicle.setVehicleID(1001);
	        vehicle.setVehicleName("CAR");
	        
	       personObj.setVehicle(vehicle);
	        
	        
	        session.save(personObj);
	        session.save(vehicle);
	       
	        //session.flush();
	        session.getTransaction().commit();
	        session.close();
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
