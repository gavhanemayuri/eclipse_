package com.example.college.Config.mainfile;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;

import com.example.college.Staff;

public class demo {

	public static void main(String[] args) {
		
		Resource r1= new ClassPathResource("/com/example/college/Config/applicationContext.xml");

		BeanFactory b1 =new XmlBeanFactory(r1);
		
		Staff s1=(Staff)b1.getBean("t1");
		s1.display();
	}
	

}
