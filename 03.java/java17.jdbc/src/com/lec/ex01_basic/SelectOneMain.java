package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";	
	final static String USR1 = "HR";
	final static String PWD1 = "hr";
	
	static Connection conn = null;
	static Connection conn1 =null;
	static PreparedStatement pstmt = null;
	static PreparedStatement pstmt1 = null;
	static ResultSet rs = null;
	static ResultSet rs1 = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select * from emp where empno=? and job=?";
			int row = 0;
			
			// emp테이블에서 한개의 row읽기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7369);
			pstmt.setString(2, "CLERK");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				System.out.println("사원번호=" + empno + ", 사원이름=" + ename + ", 입사일자=" + hiredate);
			} else {
				System.out.println("자료를 찾지 못했습니다!");
			}
		} catch (Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
		}
		 // 실습. hr에서 employees에서 사원 1명만 읽어서 사원정보를 출력
		//(사번, 사원이름(f+l), email, 전화번호)
		try {
			Class.forName(DRV);
			conn1 = DriverManager.getConnection(URL, USR1, PWD1);
			
			String sql1 = "select * from employees where employee_id=?";
			
			// emp테이블에서 한개의 row읽기
			pstmt1 = conn1.prepareStatement(sql1);
			pstmt1.setInt(1, 101);
			rs1 = pstmt1.executeQuery();
			if(rs1.next()) {
				int empid = rs1.getInt(1);
				String ef_name = rs1.getString(2);
				String el_name = rs1.getString(3);
				String email = rs1.getString("email");
				String pn = rs1.getString("PHONE_NUMBER");
				System.out.println("사원번호=" + empid + ", 사원이름=" + ef_name + el_name + ", 이메일=" + email + "번호 = " +pn);
			} else {
				System.out.println("자료를 찾지 못했습니다!");
			}
		} catch (Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs1 != null) rs1.close();
				if(pstmt1 != null) pstmt1.close();
				if(conn1 != null) conn1.close();
			} catch (Exception e) {
			}
		}
		} 
		
	}
   



