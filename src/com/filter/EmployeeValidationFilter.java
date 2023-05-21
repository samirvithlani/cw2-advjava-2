package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EmployeeValidationFilter
 */
public class EmployeeValidationFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public EmployeeValidationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("filter called...");
		HttpServletRequest request = (HttpServletRequest) req;
		String eName = request.getParameter("txtEName");
//		String eEmail = request.getParameter("txtEEmail");
//		String ePassword = request.getParameter("txtEPassword");
//		String age = request.getParameter("txtEAge");
//		int eAge = 0;
//		if (age != null || age != "") {
//			eAge = Integer.parseInt(age);
//		}
//		String salary = request.getParameter("txtESalary");
//		double eSalary = 0.0f;
//		if (salary != null || salary != "") {
//
//			eSalary = Double.parseDouble(salary);
//		}
//		// yyyy-mm-dd
//		String joingDate = request.getParameter("txtEJoiningDate");
//		String birthDate = request.getParameter("txtEBirthDate");
//		String status = request.getParameter("rdbStatus");
//		boolean isStatus = true;
//		if (status.equals("false")) {
//			isStatus = false;
//		}
		boolean flag =false;
		if (eName == "" || eName == null) {

			request.setAttribute("nameError", "Name is required...");
			flag = true;
		}
		else {
		
			chain.doFilter(req, response);
		}
		if(flag == true) {
			request.getRequestDispatcher("addEmployee.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
