package com.javaex.jdbc;

import java.sql.*;
import java.util.*;

public class HRSalary {

	public static void main(String[] args) {

		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		int min_sal=0;
		int max_sal=0;
		
		Scanner sc = new Scanner(System.in);
		
		int button = 0;
		do {
		try {
		button = 0;
		System.out.println("검색하고자 하는 최소급여를 입력하세요.");
		String a = sc.next();
		min_sal = Integer.parseInt(a);
		System.out.println("검색하고자 하는 최대급여를 입력하세요.");
		String b = sc.next();
		max_sal = Integer.parseInt(b);
		} catch (NumberFormatException e) {
			System.err.println("정수를 입력하시오.");
			button=1;
			e.printStackTrace();
		}
		} while (button==1);
		
		System.out.println("==================================");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String sql = "   SELECT last_name || ' ' || first_name AS full_name,\r\n"
				+ "           salary\r\n"
				+ "        FROM Employees \r\n"
				+ "        WHERE salary >= "+min_sal+ "AND salary <= "+max_sal
		        + "ORDER BY salary";
		
		conn = DriverManager.getConnection(dburl,"hr","hr");
		stmt = conn.createStatement();		
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			String f_name = rs.getString("full_name");
			int sal = rs.getInt("salary");
			System.out.printf("%-20s %,d%n",f_name,sal);
		}
		
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQL ERROR!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
