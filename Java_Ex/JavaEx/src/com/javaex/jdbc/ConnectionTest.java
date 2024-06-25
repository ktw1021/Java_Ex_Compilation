package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		}
		
		Connection conn = null;
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			// 접속 문자열, ID, PWD를 이용 데이터베이스 접속 시도 
			conn = DriverManager.getConnection(dburl,"hr","hr");
			System.out.println(conn);
			System.out.println("연결 성공!");
			// 이후 문장은 데이터베이스 접속 성공
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT employee_id FROM hr.Employees");
			System.out.println(rs.toString());
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			e.printStackTrace();	
			}
		}
		
		
	}

}
