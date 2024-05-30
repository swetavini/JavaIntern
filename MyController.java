package student;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();// Inbuilt class

	    // It fetches the data
	    cfg.addAnnotatedClass(Student.class).configure();

	    // It creates a Session
	    SessionFactory sf = cfg.buildSessionFactory();

	    // Session 1 , you can create multiple sessions
	    Session ss = sf.openSession();

	    // transaction use only for insert,update,delete not for select
	    Transaction t = ss.beginTransaction();
	    Student s = new Student(1,1234,"saving", "Nikhil");
	    /*
	     * s = new Student(2, "jayesh"); s = new Student(3, "utkarsh");
	     */

	   // ss.save(s); 
	    System.out.println("Data inserted!");
	     

	    /*
	     * ss.update(s); System.out.println("Data Updated!");
	     */

	    /*
	     * ss.delete(s); System.out.println("Data Deleted!");
	     */

	    t.commit();
	    Criteria query = ss.createCriteria(Student.class);
	    System.out.println("Student table");
	        List<Student> list = query.list();

	        for (Student dc : list) {
	          System.out.println(dc.getId()+" "+dc.getAccno()+" "+dc.getAcctype()+" "+dc.getName());
	        }
	    ss.close();

	    /* 
	     * Way to create Multiple sessions Session ss1 = sf.openSession();
	     * 
	     * ss1.close();
	     */
	}

}
