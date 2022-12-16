package com.lec.web.jdbc;

import java.sql.*;

public class JDBCUtil {
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			//dummy
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null) conn.rollback();
		} catch (Exception e) {
			//dummy
		}
	}
}
