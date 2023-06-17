package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.StudentBean;
import com.util.DBConnection;

public class StudentDao {

	
	public boolean checkStudent(String email) {
		
		boolean flag = false;
		Connection conn = DBConnection.getDbConnection();
		if(conn!=null) {
			
			try {
				PreparedStatement pstmt = conn.prepareStatement("select * from student where sname =?");
				pstmt.setString(1, email);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					flag = true;
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return flag;
	}


}
