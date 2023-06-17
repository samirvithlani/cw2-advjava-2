package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("data");
		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.checkStudent(email);
		// if flag returns true -->email already exist..
		System.out.println(flag);
		String responseData ="";
		if(flag) {
			responseData ="1";
		}
		else {
			responseData ="2";
		}
		

		// Set the response content type
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		// Write the response data
		response.getWriter().write(responseData);

	}

}
