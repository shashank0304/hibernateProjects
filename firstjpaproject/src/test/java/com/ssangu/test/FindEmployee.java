package com.ssangu.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.ssangu.jpa.entities.Employee;

public class FindEmployee {
	
	@Test
	public static void main(String [] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("HibernateJPA");
		EntityManager emManager = emFactory.createEntityManager();
		//emManager.getTransaction().begin();
		
		Employee emp = emManager.find(Employee.class, 1);
		System.out.println(emp.getName());
	}
}
