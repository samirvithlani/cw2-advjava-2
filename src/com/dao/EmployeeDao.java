package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.EmployeeBean;
import com.util.DBConnection;

public class EmployeeDao {

	public boolean addEmployee(EmployeeBean employeeBean) {

		boolean flag = false;

		Connection conn = DBConnection.getDbConnection();
		if (conn != null) {

			String insertSQL = "insert into employee1(eName,eEmail,ePassword,eAge,eJoiningDate,eBirthDate,eSalary,status)values(?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, employeeBean.geteName());
				pstmt.setString(2, employeeBean.geteEmail());
				pstmt.setString(3, employeeBean.getePassword());
				pstmt.setInt(4, employeeBean.geteAge());
				pstmt.setDate(5, employeeBean.geteJoiningDate());
				pstmt.setDate(6, employeeBean.geteBirtDate());
				pstmt.setDouble(7, employeeBean.geteSalary());
				pstmt.setBoolean(8, employeeBean.isStatus());

				int res = pstmt.executeUpdate();
				if (res > 0) {
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
