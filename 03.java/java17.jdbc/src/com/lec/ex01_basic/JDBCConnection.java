package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
	JDBC를 이용한 Java와 DB연동하기
	
	Java와 DB를 연동하기 위해서는 각 DBMS의 버전에 맞는 JRE실행환경 라이브리를 Java프로젝트에
	추가해야 한다. JDBC드라이버는 DB버전에 맞는 JDBC드라이버(오라클인 경우 ojdbc???.jar)를 
	등록해야 한다. (Oracle JDBC버전 참고 사이트 : https://oingdaddy.tistory.com/372)
	
	라이브러리를 추가하는 방법
	
	1. Java Project를 우클릭
	2. Build Path > Configure Build Path > (tab)Libraires> (button)Add Jars ... > (button)Apply & Close
	
	A. JDBC프로그램 작성 step
	
	1. JDBC드라이버를 로드(DB에 따라 드라이버가 상이)
	
	   a. oracle 드라이버  : oracle.jdbc.OracleDriver
	   b. mariadb 드라이버 : org.mariadb.jdbc.Driver
	   c. MySQL 드라이버   : com.mysql.jdbc.driver
	
	2. Connection객체를 생성
	   
	   Connection객체에 연결하는 것은 DriverManager에 등록된 각 드라이버를 getConnection()
	   메서드를 이용해서 식별한다. getConnection(db url주소, username, password)의 매개값을
	   전달한다. 연결할 때 url식별자 정보를 이용히새 Mapping을 하고 차지 못했을 경우에는
	   no sutable error가 발생한다. 찾았을 경우에는 수행결과가 Connection객체에 전달된다.
	   
	   a. Oracle : getConnection("jdbc:oracle:thin:@오라클DB주소:port번호:서비스id", "scott", "tiger");
	   b. mariadb: getConnection("jdbc:mariadb://mariadb주소", "userID", "password");
	   c. MySQL  : getConnection("jdbc:mysql://MySQLdb주소", "userID", "password");

	3. Statement(Statement/PreparedStatement/CallableStatement)
	
	   SQL생성 및 실행하면 반환된 결과를 가져오게할 작업영역을 제공한다. Statement객체는 
	   Connection객체의 createStatement()메서드를 사용하여 생성한다.
	   
	   이 단계부터는 JDBC드라이버에 구애를 받지 않는다. 즉, DB상관없이 동일한 명령으로
	   사용할 수 있다. 단 SQL표준문법을 준수할 경우 동일한 명령이지만 DB마다 고유한 명령
	   일 경우 각 DB의 SQL문법에 맞게 작성되어야 한다.
	   
	   Statement         stmt  = conn.createStatement(); 
	   PreparedStatement pstmt = conn.createStatement(); 
	   CallableStatement cstmt = conn.prepareCall("{call 스트어프러시저 (?,?,?}");
	   
    4. Query실행
    
       Statement객체가 생성된 후에 Statement객체의 executeQuery(), executeUpdate()메서드를
       사용하여 처리한다.
       
       ResultSet rs = stmt.executeQuery("select * from emp where depno = 10");
       ResultSet rs = pstmt.executeQuery("select * from emp where depno = ?");
       ResultSet rs = cstmt.execute();
       
    5. ResultSet처리
    
       executeQuery()메서드는 결과를 ResultSet으로 리턴한다. 이 ResultSet으로 부터 읽은 
       데이터를 추출하는 과정이 ResultSet처리과정이다.
       
       데이터를 추출하는 방법은 ResultSet에서 한 행(row)씩 이동하면서 getXXX()메서드를
       이용하여 데이터를 추출하는 데 rs.getString(1) or rs.getInt("컬럼명")의 방법으로
       추출한다.
    
    6. Transaction처리
    
       1) commit()
       2) rollback()
	   
*/
public class JDBCConnection {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";
			
			
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName(DRV); // 클래스로더가 메서드영역에 oracle드라이버를 로딩
			conn = DriverManager.getConnection(URL, USR, PWD);
			System.out.println("DB연결성공!!!");
		} catch (Exception e) {
			System.out.println("DB연결실패!!!");
			e.printStackTrace();
		} finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
