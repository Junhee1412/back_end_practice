package com.lec.ex02_board;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private String path = ConnectionFactory.class.getResource("jdbc0.properties").getPath();
	
	private String DRV = null;
	private String URL = null;
	private String USR = null;
	private String PWD = null;
	
	private String insert = null;
	private String select = null;
	private String update = null;
	private String delete = null;
	
	public ConnectionFactory() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// jdbc.properties의 정보를 읽어오는 메서드
	// db접속정보와 sql정보를 가져오는 메서드
	public void setUp() throws Exception {
		
		Properties p = new Properties();
		path = URLDecoder.decode(path, "utf-8");
		p.load(new FileReader(path));
		
		// 1. DB접속정보
		DRV = p.getProperty("jdbc.drv");
		URL = p.getProperty("jdbc.url");
		USR = p.getProperty("jdbc.usr");
		PWD = p.getProperty("jdbc.pwd");
		
		// 2. SQL정보
		insert = p.getProperty("insert");
		select = p.getProperty("select");
		update = p.getProperty("update");
		delete = p.getProperty("delete");
		
		// System.out.println(DRV);
		// System.out.println(URL);
		// System.out.println(USR);
		// System.out.println(PWD);
		// System.out.println(insert);
		// System.out.println(select);
		// System.out.println(update);
		// System.out.println(delete);
		
		Class.forName(DRV);
	}
	
	public Connection getConnection() {
		try {
			// System.out.println("DB접속성공!!");			
			return DriverManager.getConnection(URL, USR, PWD);
		} catch (SQLException e) {
			System.out.println("DB접속실패!!");
			e.printStackTrace();
			return null;
		}
	}

	public String getInsert() {
		return insert;
	}

	public String getSelect() {
		return select;
	}

	public String getUpdate() {
		return update;
	}

	public String getDelete() {
		return delete;
	}
}

















