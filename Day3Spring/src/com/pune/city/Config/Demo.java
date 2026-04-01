package com.pune.city.Config;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pune.city.employee;

public class Demo {

	public static void main(String[] args) {
	
		ApplicationContext con = new ClassPathXmlApplicationContext("/com/pune/city/Config/applicationContext.xml");

		employee e1 =(employee) con.getBean("t1");
		e1.display();
	}

}
