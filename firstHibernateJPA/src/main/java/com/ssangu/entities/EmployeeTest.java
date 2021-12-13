package com.ssangu.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("EmployeeDB");
		EntityManager emManager = emFactory.createEntityManager();
		//emManager.getTransaction().begin();
		
		Employee emp = emManager.find(Employee.class, 1);
		System.out.println(emp.getName());
				
	}
}
