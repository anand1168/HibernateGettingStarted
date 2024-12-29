package com.selleniumexpress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.selleniumexpress.entity.Song;
import com.selleniumexpress.utils.Utility;

public class CreateApp 
{
    public static void main( String[] args )
    {
    	Transaction transaction =null;
    	Session session =null;
    	SessionFactory sessionFactory=Utility.getSessionFactory() ;
    	
    	// open a session
    	
    	if(sessionFactory!=null) {
    		
    		try {
    			 session = sessionFactory.openSession();
    	    	
    	    	Song song=new Song("It Friday Night","Sia");
    	    	
    	    	transaction = session.beginTransaction();
    	    	session.save(song);
    	    	transaction.commit();
    	    	
    	    	
    	    	System.out.println("Song saved into DB");
    			    			
    		}catch(Exception ex) {
    			
    			ex.printStackTrace();
    			
    			
    		}finally {
    			
    			System.out.println("Inside finally block");
    			session.close();
    			
    		}
    	
    	
    	
    	}
    	
    	
    }
}
