/**
 * 
 */
package com.kanchan.hibernate.topics.manytomanymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanchan.hibernate.topics.manytomanymapping.PersonManyToMany;
import com.kanchan.hibernate.utils.HibernateUtil;

/**
 * @author kanchan kumar
 * 
 *
 */
public class HibernateManyToManyMappingTestMain {

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
	        
	        PersonManyToMany personObj1 = new PersonManyToMany();
	        personObj1.setfName("FIRST PERSON FN");
	        personObj1.setlName("FIRST PERSON LN");
	        personObj1.setAge(60);
	        personObj1.setGender("MALE");
	        
	        PersonManyToMany personObj2 = new PersonManyToMany();
	        personObj2.setfName("SESOND PERSON FN");
	        personObj2.setlName("SECOND PERSON LN");
	        personObj2.setAge(80);
	        personObj2.setGender("FEMALE");
	        
	        VehicleManyToMany vehicle1 = new VehicleManyToMany();
	        vehicle1.setVehicleName("CAR");
	        
	        VehicleManyToMany vehicle2 = new VehicleManyToMany();
	        vehicle2.setVehicleName("CAMRY");
	        
	        personObj1.getListOfVehicle().add(vehicle1);
	        personObj1.getListOfVehicle().add(vehicle2);
	        
	        personObj2.getListOfVehicle().add(vehicle1);
	        personObj2.getListOfVehicle().add(vehicle2);
	        
	        vehicle1.getListOfPerson().add(personObj1);
	        vehicle1.getListOfPerson().add(personObj2);
	        
	        vehicle2.getListOfPerson().add(personObj1);
	        vehicle2.getListOfPerson().add(personObj2);
	        
	        session.save(personObj1);
	        session.save(personObj2);
	        session.save(vehicle1);
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
