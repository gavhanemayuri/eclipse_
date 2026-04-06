package HibernateDay1.HibernateDay1;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       
    	Staff1 s1 = new Staff1();
    	
    	s1.setSid(11);
    	s1.setSname("vaishnavi");
    	s1.setSemail("vdhote@gmail.com");
    	
    
     Configuration con = new Configuration();
     con.configure("hibernate.cfg.xml");
    
    SessionFactory sf= con.buildSessionFactory();
    Session ss= sf.openSession(); 
    ss.save(s1);
    
    ss.beginTransaction().commit();
     
    }
}