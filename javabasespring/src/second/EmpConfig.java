package second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import first.employee;
@Configuration
public class EmpConfig 

{
     @Bean
	public employee empobj()
	{
		employee e1 =new employee();
		e1.setEid(101);
		e1.setEname("Mayuri");
		e1.setEemail("mayuri@gmail.com");
		e1.setEpass("mayuri");
		
		return e1;
	}
	
	
}
