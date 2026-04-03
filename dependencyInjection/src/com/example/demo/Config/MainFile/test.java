package com.example.demo.Config.MainFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Doctor;
public class test {

	public static void main(String[] args) {
		
				
		          ApplicationContext c1 = new ClassPathXmlApplicationContext("/com/example/demo/Config/applicationContext.xml");
		          
		          Doctor d1=(Doctor)c1.getBean("t1");
		         d1.display();


	}

}
