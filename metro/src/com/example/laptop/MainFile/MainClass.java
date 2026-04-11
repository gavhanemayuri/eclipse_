package com.example.laptop.MainFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.laptop.College;

public class MainClass {

	public static void main(String[] args) 
	{
		
ApplicationContext con = new ClassPathXmlApplicationContext("/com/example/laptop/Config/applicationContext.xml");
		        College college = (College)con.getBean("t1");
		        	
		        college.show();
		    
		
	}

}
