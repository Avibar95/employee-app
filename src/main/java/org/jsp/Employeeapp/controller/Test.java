package org.jsp.Employeeapp.controller;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		Session s= new Configuration().configure().buildSessionFactory().openSession();
		
	}

}
