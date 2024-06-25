package com.javaex.jdbc;

import java.sql.*;
import java.util.*;

public class HR_PreparedSearchEmployees {

	public static void main(String[] args) {
		System.out.println("검색할 사원 이름을 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String scOb = sc.next();
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(dburl,"hr","hr");
		
		String qul = "    SELECT last_name || ' ' || first_name AS full_name, "
				+ 				"email AS mail, "
				+ 				"phone_number AS ph, "
				+ 				"TO_CHAR(hire_date,'YYYY-MM-DD') AS hire_date \r\n"
				+ "        FROM Employees\r\n"
				+ "        WHERE LOWER(last_name) LIKE ?\r\n"
				+ "        OR LOWER(first_name) LIKE ?";
		pstmt = conn.prepareStatement(qul);
		String likePattern = "%" + scOb.toLowerCase() + "%";
		pstmt.setNString(1, likePattern);
		pstmt.setNString(2, likePattern);
		rs=pstmt.executeQuery();
		while (rs.next()) {
			String f_name= rs.getString("full_name");
			String email = rs.getString("mail");
			String ph = rs.getString("ph");
			String hd = rs.getString("hire_date");
			
			System.out.printf("%s, %s, %s, %s%n",f_name,email,ph,hd);
		}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQL ERROR!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {conn.close();}
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {rs.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(pstmt!=null) {pstmt.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
