package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.User;

public class UserDao {
	public void add(String name,String userId,String password){
		 try {
	            // 1. configuring hibernate
	            Configuration configuration = new Configuration().configure();
	 
	            // 2. create sessionfactory
	            SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
	            // 3. Get Session object
	            Session session = sessionFactory.openSession();
	 
	            // 4. Starting Transaction
	            Transaction transaction = session.beginTransaction();
	            
	            //5. Setting Details
	            User u = new User();
	            //u.setId(id);
	            u.setName(name);
	            u.setUserId(userId);
	            u.setPassword(password);
	          //6. Saving Session
	            session.save(u);
	            
	            //7. Closing Transaction
	            transaction.commit();
		 }
		 catch (HibernateException e) {
	            System.out.println(e.getMessage());
	            System.out.println("error");
	        }
	}

	
	}
	


