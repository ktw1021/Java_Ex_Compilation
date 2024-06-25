package com.javaex.jdbc;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		// Connection, Statement, ResultSet
		// try - with - resources 문 (자동 자원 정리)
		// AutoCloseable 인터페이스를 구현한 클래스들을 사용 가능
		ResultSet rs = null;
		Connection conn = null;
		Statement stmt = null;
		try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(dburl,"hr","hr");
					stmt = conn.createStatement();
					
					String sql = "SELECT region_name\r\n"
							+ "    FROM Regions r\r\n"
							+ "    JOIN Countries c ON r.region_id = c.region_id\r\n"
							+ "    JOIN Locations l ON c.country_id = l.country_id\r\n"
							+ "    JOIN Departments d ON l.location_id = d.location_id\r\n"
							+ "    JOIN Employees e ON d.department_id = e.department_id\r\n"
							+ "    WHERE region_name = (\r\n"
							+ "        SELECT region_name \r\n"
							+ "        FROM (\r\n"
							+ "            SELECT region_name\r\n"
							+ "            FROM Regions r2\r\n"
							+ "            JOIN Countries c2 ON r2.region_id = c2.region_id\r\n"
							+ "            JOIN Locations l2 ON c2.country_id = l2.country_id\r\n"
							+ "            JOIN Departments d2 ON l2.location_id = d2.location_id\r\n"
							+ "            JOIN Employees e2 ON d2.department_id = e2.department_id\r\n"
							+ "            GROUP BY r2.region_name\r\n"
							+ "            ORDER BY AVG(e2.salary) DESC\r\n"
							+ "            )\r\n"
							+ "            WHERE rownum = 1\r\n"
							+ "            )\r\n"
							+ "            AND rownum = 1";
					rs = stmt.executeQuery(sql);	// DB cursor 반환
					
					// ResultSet 순회
					while (rs.next()) {
						// getXXX(컬럼 순서) or getXXX(컬럼 프로젝트 이름)
//						int deptId = rs.getInt(1);	// rs.getInt("department_id")
						String regionName = rs.getString("region_name");	// rs.getString(2)
						System.out.printf("%s%n",  regionName);
					}
					
				} catch (ClassNotFoundException e) {
					System.err.println("드라이버를 로드하지 못했습니다.");
					e.printStackTrace();
				} catch (SQLException e) {
					System.err.println("SQLError!");
					e.printStackTrace();
				} finally {
					try {
						rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					try {
						stmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					try {
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
	}

}
