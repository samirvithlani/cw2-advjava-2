package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.ls.LSInput;

import com.bean.UserBean;

/**
 * Servlet implementation class ForEachController
 */
public class ForEachController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("cpp");
		list.add("node");
		
		UserBean userBean = new UserBean();
		List<UserBean> lists = new ArrayList<UserBean>();
		userBean.setId(101);
		userBean.setName("raj");
		lists.add(userBean);
		
		//request.setAttribute("list", list);
		request.setAttribute("users", lists);
		request.getRequestDispatcher("foreach.jsp").forward(request, response);
		
		
		
		
		
		
		
		
	}

}
