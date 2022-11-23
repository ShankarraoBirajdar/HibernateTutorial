package com.hibernate.tutorial.TablePerSubClassXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/hibernate/tutorial/TablePerSubClassXML/Hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		
//		SessionFactory factory= new Configuration().configure("com/hibernate/tutorial/TablePerHierarchyXML/Hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx= session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Shankar Birajdar");
		RegularEmployee re = new RegularEmployee();
		re.setName("Vivek Kumar");
		re.setSalary(50000);
		re.setBonus(5);
		ContractEmployee ce= new ContractEmployee();
		ce.setName("Arjun Kumar");
		ce.setPayPerHour(1000);
		ce.setContractDuration("15 hours");
		
		session.save(employee);
		session.save(re);
		session.save(ce);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
