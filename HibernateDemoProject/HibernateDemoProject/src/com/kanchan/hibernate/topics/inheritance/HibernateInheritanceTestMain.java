/**
 * 
 */
package com.kanchan.hibernate.topics.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.onetoonemapping.PersonOneToOne;
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
	        
	        VehicleInheritance vehicle = new VehicleInheritance();
	        vehicle.setVehicleName("CAR");
	        
	        VehicleFourWheeler vehicleFourWheeler = new VehicleFourWheeler();
	        vehicleFourWheeler.setSteeringWheel("STEERING WHEEL");
	        vehicleFourWheeler.setVehicleName("PORSCHE");
	        
	        VehicleTwoWheeler vehicleTwoWheeler = new VehicleTwoWheeler();
	        vehicleTwoWheeler.setSteeringHandle("HANDLE");
	        vehicleTwoWheeler.setVehicleName("BIKE");
	        
	        session.save(vehicle);
	        session.save(vehicleTwoWheeler);
	        session.save(vehicleFourWheeler);
	       
	        //session.flush();
	        session.getTransaction().commit();
	        session.close();
			
		}catch (Exception e){
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
        

	}

}
