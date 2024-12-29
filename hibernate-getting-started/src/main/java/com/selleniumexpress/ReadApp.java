package com.selleniumexpress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selleniumexpress.entity.Song;
import com.selleniumexpress.utils.Utility;

public class ReadApp 
{
    public static void main( String[] args )
    {
        
    	SessionFactory sessionFactory =Utility.getSessionFactory() ;
    	
    	Session session = sessionFactory.openSession();
    	
    	Song song = session.get(Song.class, 1);
    
    	session.close();
    	System.out.println(song);
    	
    	
    	
    	
    	
    	
    	
    }
}
