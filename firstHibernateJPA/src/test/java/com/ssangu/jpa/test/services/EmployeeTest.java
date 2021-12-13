package com.ssangu.jpa.test.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.ssangu.entities.Employee;

public class EmployeeTest {
	
	@Test
	public void testFindEmployee() {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("EmployeeDB");
		EntityManager emManager = emFactory.createEntityManager();
		//emManager.getTransaction().begin();
		
		Employee emp = emManager.find(Employee.class, 1);
		System.out.println(emp.getName());
				
	}
}