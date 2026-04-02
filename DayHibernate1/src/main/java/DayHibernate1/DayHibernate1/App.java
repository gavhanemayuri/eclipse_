package DayHibernate1.DayHibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    /*	Doctor d1 = new Doctor();
    	d1.setDid(111);
    	d1.setDname("Dr.Jadhav");
    	d1.setDemail("dr.jadhav@gmaile.com");
    	
   Patient p1 = new Patient();
   p1.setPid(999);
   p1.setPname("mayur");
   p1.setPdis("Fever");
   p1.setD1(d1);
   
    	d1.setP1(p1);
    */	
    	
    	 Configuration con = new Configuration() .configure("hibernate.cfg.xml");
         
         SessionFactory sf= con.buildSessionFactory();
         
        Session ss = sf.openSession(); 
        
       // ss.save(d1);
       // ss.save(p1);
        
        Doctor dk =(Doctor) ss.get(Doctor.class, 999);
        System.out.println(dk.getP1().getPname());
        
        ss.beginTransaction().commit();
     
//        Patient pp = (Patient) ss.get(Patient.class, 111);
//        System.out.println(pp.getD1().getDname());
    }
}
