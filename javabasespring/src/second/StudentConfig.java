package second;

import org.springframework.context.annotation.Configuration;

import first.Student;
import org.springframework.context.annotation.Bean;
import second.EmpConfig;


@Configuration
public class StudentConfig


{
	
     @Bean
	public Student stu () 
     {
		
		Student s1 = new Student();
		s1.setEid(202);
		s1.setEname("mayur");
		s1.setEemail("mayur@gemail.com");
		s1.setEpass("mayur1212");
		
		
		
	
	return s1;
     }
	
}
