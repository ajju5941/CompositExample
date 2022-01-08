package com.Composit.CompositExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        EmployeeId eId = new EmployeeId(101L,12346L);
        Employee e = new Employee();
        e.setId(eId);
        e.setName("Aijaz");
        
        EmployeeIdClassExample ePk = new EmployeeIdClassExample();
        
        ePk.setEmpId(101);
        ePk.setDepId(2);
        ePk.setName("Aijaz");
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e);
        session.save(ePk);
        transaction.commit();
        session.close();
        
    }
}
