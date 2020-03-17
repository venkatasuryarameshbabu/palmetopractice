package com.hibernate.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
public static void main(String[] args)
{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();  
  Employee e1=new Employee();
  e1.setId(101);
  e1.setFirstname("surya");
  e1.setLastname("kaja");
  session.save(e1);
  t.commit();
  System.out.println("sucessfully saved");
  factory.close();
  session.close();
}
}
