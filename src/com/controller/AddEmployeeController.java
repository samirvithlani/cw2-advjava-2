package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;
import com.dao.EmployeeDao;

/**
 * Servlet implementation class AddEmployeeController
 */
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String eName = request.getParameter("txtEName");
		String eEmail = request.getParameter("txtEEmail");
		String ePassword = request.getParameter("txtEPassword");
		String age = request.getParameter("txtEAge");
		int eAge = 0;
		if (age != null || age != "") {
			eAge = Integer.parseInt(age);
		}
		String salary = request.getParameter("txtESalary");
		double eSalary = 0.0f;
		if (salary != null || salary != "") {

			eSalary = Double.parseDouble(salary);
		}
		// yyyy-mm-dd
		String joingDate = request.getParameter("txtEJoiningDate");
		String birthDate = request.getParameter("txtEBirthDate");
		String status = request.getParameter("rdbStatus");
		boolean isStatus = true;
		if (status.equals("false")) {
			isStatus = false;
		}

		System.out.println(eName);
		System.out.println(eEmail);
		System.out.println(ePassword);
		System.out.println(eAge);
		System.out.println(eSalary);
		System.out.println(joingDate);
		System.out.println(birthDate);
		Date eJoiningDate = null;
		Date eBirthDate = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date jDate = format.parse(joingDate);
			eJoiningDate = (Date) new java.sql.Date(jDate.getTime());
			java.util.Date bDate = format.parse(birthDate);
			eBirthDate = (Date) new java.sql.Date(bDate.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.seteName(eName);
		employeeBean.seteEmail(eEmail);
		employeeBean.setePassword(ePassword);
		employeeBean.seteAge(eAge);
		employeeBean.seteBirtDate(eBirthDate);
		employeeBean.seteJoiningDate(eJoiningDate);
		employeeBean.setStatus(isStatus);
		employeeBean.seteSalary(eSalary);

		if (new EmployeeDao().addEmployee(employeeBean)) {
			response.sendRedirect("list");
		} else {
			response.sendRedirect("list");
		}

	}

}
