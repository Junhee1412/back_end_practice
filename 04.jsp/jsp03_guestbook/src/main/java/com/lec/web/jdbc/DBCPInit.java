package com.lec.web.jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		loadJDBCDriver();
		initConnectionPool();
	}

	private void loadJDBCDriver() {
		String driverClass = getInitParameter("jdbcDriver");
		try {
			Class.forName(driverClass);
		} catch (Exception e) {
			throw new RuntimeException("JDBC 드라이버 로딩 실패!");
		}
	}

	private void initConnectionPool() {
		
		String url = getInitParameter("url");
		String usr = getInitParameter("user");
		String pwd = getInitParameter("pass");
		
		ConnectionFactory cf = new DriverManagerConnectionFactory(url, usr, pwd);
		PoolableConnectionFactory pcf=new PoolableConnectionFactory(cf, null);
		pcf.setValidationQuery("select 1");//mariadb, mysql
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig<>();
		poolConfig.setTimeBetweenEvictionRunsMillis(100l*60l*5l);//검사주기를 5분으로 설정
		poolConfig.setTestWhileIdle(true);
		poolConfig.setMinIdle(5);
		poolConfig.setMaxIdle(10);
		GenericObjectPool<PoolableConnection> cp = new GenericObjectPool<>(pcf, poolConfig);
		pcf.setPool(cp);
		try {
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			String poolName = getInitParameter("poolName");
			driver.registerPool(poolName, cp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
