package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) " 
			           + " values(?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			pstmt.setString(2, "소향");
			pstmt.setString(3, "가수");
			pstmt.setInt(4, 7839);
			pstmt.setString(5, "2022-12-07");
			pstmt.setInt(6, 1000);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 10);
			int row = pstmt.executeUpdate();
			System.out.println("emp테이블에 " + row + "건이 추가 되었습니다!!");
		} catch (Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				// dummy
			}			
		}

	}
}