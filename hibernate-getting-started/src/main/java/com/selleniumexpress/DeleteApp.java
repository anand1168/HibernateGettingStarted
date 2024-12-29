package com.selleniumexpress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selleniumexpress.entity.Song;
import com.selleniumexpress.utils.Utility;

public class DeleteApp 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory =Utility.getSessionFactory() ;
        
        Session session = sessionFactory.openSession();
        
        Song song = session.load(Song.class, 1);
        
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
        session.close();
    	
    	
    	
    	
    }

	
}
