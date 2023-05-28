package com.listners;

import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ServerListener
 *
 */
public class ServerListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ServerListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	
	FileWriter fw;
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stu
		System.out.println("server down....");
		try {
			fw = new FileWriter("D:\\royal\\advance java\\Cw2_adv_java_2\\src\\com\\listners\\abc.txt");
			fw.write("ok");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("server started....");
		System.out.println(arg0.getServletContext());
	}

}
