package com.exmaple.metro.config.mainfile;

import org.springframework.context.ApplicationContext;
import com.exmaple.metro.employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class demo {

	public static void main(String[] args) 
	
	{
	ApplicationContext c1 = new ClassPathXmlApplicationContext("/com/exmaple/metro/config/applicationContext.xml");
	employee em= (employee)c1.getBean("t1");
	em.display();	
	
	System.out.println("----------------------------------------------");
	
	employee em1=(employee)c1.getBean("t2");
	em1.display();
		
	}

}
