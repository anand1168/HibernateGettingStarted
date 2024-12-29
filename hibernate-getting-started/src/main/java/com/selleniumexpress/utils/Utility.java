package com.selleniumexpress.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selleniumexpress.entity.Song;

public class Utility {
	
	private static SessionFactory sessionFactory=null;
	
	
	public static SessionFactory getSessionFactory() throws HibernateException {
		
		if(sessionFactory==null) {
		
		Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Song.class);
        
        sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
		
		}
		return sessionFactory;
	}

}
