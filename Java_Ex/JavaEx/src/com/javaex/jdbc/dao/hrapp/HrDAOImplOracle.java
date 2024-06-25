package com.javaex.jdbc.dao.hrapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HrDAOImplOracle implements HrDAO {
	private static Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl,DatabaseConfig.DB_USER,DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	public List<HrVO> getList() {
		List<HrVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT last_name || ' ' || first_name AS full_name, email, phone_number, TO_CHAR(hire_date,'YYYY-MM-DD')\r\n"
					+ "FROM Employees";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String full_name = rs.getString(1);
				String email = rs.getString(2);
				String phone_number = rs.getString(3);
				String hire_date = rs.getString(4);
				
				HrVO vo = new HrVO(full_name, email, phone_number, hire_date);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public List<HrVO> search(String search_key) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HrVO vo = null;
		List<HrVO> results = new ArrayList<>();
		
		try {
			conn = getConnection();
			String sql = "    SELECT last_name || ' ' || first_name AS full_name, "
					+ 				"email, "
					+ 				"phone_number, "
					+ 				"TO_CHAR(hire_date,'YYYY-MM-DD') AS hire_date \r\n"
					+ "        FROM Employees\r\n"
					+ "        WHERE LOWER(last_name) LIKE ?\r\n"
					+ "        OR LOWER(first_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			String likePattern = "%" + search_key.toLowerCase() + "%";
			pstmt.setNString(1, likePattern);
			pstmt.setNString(2, likePattern);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String full_name = rs.getString(1);
				String email = rs.getString(2);
				String phone_number = rs.getString(3);
				String hire_date = rs.getString(4);
				vo = new HrVO(full_name, email, phone_number, hire_date);
				results.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return results;
	}
	
	public List<HrVO> getSalary(int min_sal, int max_sal) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HrVO vo = null;
		List<HrVO> results = new ArrayList<>();
		
		try {
			conn = getConnection();
			String sql = "   SELECT last_name || ' ' || first_name AS full_name,\r\n"
					+ "           salary\r\n"
					+ "        FROM Employees \r\n"
					+ "        WHERE salary >= ? AND salary <= ?"
			        + "ORDER BY salary";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, min_sal);
			pstmt.setInt(2, max_sal);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String full_name = rs.getString(1);
				int salary = rs.getInt(2);
				vo = new HrVO(full_name, salary);
				results.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return results;
	}
	
}
