package com.example.demo.Mainfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.Customer;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext c1 = new  AnnotationConfigApplicationContext();
         c1.register(Customer.class);
		c1.refresh();
		Customer cm =(Customer)c1.getBean("customer");
		cm.display();
	}

}
