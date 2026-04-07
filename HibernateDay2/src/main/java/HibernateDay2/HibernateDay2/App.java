package HibernateDay2.HibernateDay2;

import org.hibernate.Session;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
      Student s1 = new Student() ; 
        s1.setSid(303);
        s1.setSname("Madhura");
        s1.setSemail("madhura@gemail.com");
        
        adderss a1 = new adderss();
        a1.setLocation("kamatvada");
        a1.setCity("nashik");
        a1.setPincode("411007");
        

        
        Configuration con = new Configuration() .configure("hibernate.cfg.xml");
        
        SessionFactory sf= con.buildSessionFactory();
        
       Session ss = sf.openSession(); 
       
       ss.save(s1);
       
       ss.beginTransaction().commit();
    }
}
