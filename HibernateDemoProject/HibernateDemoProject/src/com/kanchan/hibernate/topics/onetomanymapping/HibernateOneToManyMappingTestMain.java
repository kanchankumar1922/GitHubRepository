/**
 * 
 */
package com.kanchan.hibernate.topics.onetomanymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.onetomanymapping.PersonOneToMany;
import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kumark
 *
 */
public class HibernateOneToManyMappingTestMain {

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
	        
	        PersonOneToMany personObj = new PersonOneToMany();
	        personObj.setfName("CAR CAMRY");
	        personObj.setlName("COROLA CAR");
	        personObj.setAge(100);
	        personObj.setGender("FEMALE");
	        
	        VehicleOneToMany vehicle = new VehicleOneToMany();
	        vehicle.setVehicleName("CAR");
	        
	        VehicleOneToMany vehicle2 = new VehicleOneToMany();
	        vehicle2.setVehicleName("CAMRY");
	        
	        personObj.getListOfVehicle().add(vehicle);
	        personObj.getListOfVehicle().add(vehicle2);
	        
	        vehicle.setPerson(personObj);
	        vehicle2.setPerson(personObj);
	        
	        session.save(personObj);
	        session.save(vehicle);
	        session.save(vehicle2);
	        //session.flush();
	        session.getTransaction().commit();
	        session.close();
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
