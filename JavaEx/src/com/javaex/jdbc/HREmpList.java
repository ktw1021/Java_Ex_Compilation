package com.javaex.jdbc;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr","hr");
			stmt = conn.createStatement();
		
		String sql = " SELECT e.first_name AS employee_name, e2.first_name AS manager_name\r\n"
				+ "        FROM Employees e\r\n"
				+ "        JOIN Employees e2 ON e.manager_id=e2.employee_id"
				+ "		   ORDER BY e.first_name DESC"	;
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			String f_name = rs.getString("employee_name");
			String m_name = rs.getString("manager_name");
			System.out.printf("%s's manager is %s%n", f_name, m_name);
		}
		
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQL Error!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
