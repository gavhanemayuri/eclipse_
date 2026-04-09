package third;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.Student;
import first.employee;
import second.EmpConfig;
import second.StudentConfig;
import second.EmpConfig;
public class MainFile 
{
    public static void main(String[] args) {
    	
    	AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(EmpConfig.class,StudentConfig.class);
    	
    	employee e1=(employee)con.getBean("empobj");
    	
    	e1.display();
    	
    	Student s1=(Student)con.getBean("stu");
    	s1.show();
    	
    }
	
	
}
