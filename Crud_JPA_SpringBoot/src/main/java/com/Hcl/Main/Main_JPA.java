package com.Hcl.Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Hcl.Entities.Employee;




public class Main_JPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee emp=new Employee(2,"puneet");
		EntityManagerFactory emf=
		 Persistence.createEntityManagerFactory("persistence");
		EntityManager em= emf.createEntityManager();
//		EntityTransaction et= em.getTransaction();
//		et.begin(); or
		
		//em.getTransaction().begin();
		
		
		
		//em.persist(emp);// add data 
		
		
		
//		Employee e=em.find(Employee.class, 2);//read
//		System.out.println("data is "+e);

//		Employee e=em.find(Employee.class, 2); //update
//		e.setEmpName("rahul sharma");
//		em.persist(e);
		
//		Employee e=em.find(Employee.class, 1); 
//		em.remove(e);//remove
		
		
		//jpql
		
		String str="SELECT e FROM Employee e";
		Query query=em.createQuery(str);
		
	List<Employee> list= query.getResultList();    //query.getResultList() for multiple result getsinglelist
		System.out.println(list+".......");
		
		
		System.out.println(em.createQuery("SELECT e FROM Employee e WHERE e.empId=1").getSingleResult());
		//em.getTransaction().commit();
		emf.close();

	}

}
