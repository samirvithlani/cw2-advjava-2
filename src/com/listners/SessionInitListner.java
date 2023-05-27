package com.listners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionInitListner
 *
 */
public class SessionInitListner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public SessionInitListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         
    	System.out.println("session created...");
    	HttpSession session = arg0.getSession();
    	System.out.println(session.getId());
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        
    	System.out.println("session destoyed.....");
    }
	
}
