package com.lec.ex03_map.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

/*
	Properties는 Hashtable의 하위클래스이기 때문에 Hashtable의 모든 속성을 그대로 가지고 있다.
	차이점은 Hashtable은 키와 값의 다양한 참조타입을 정의할 수 있는데 Properties는 키와 값의
	데이터타입은 오직 String타입으로만 정의할 수 있게 제한된 Map 컬렉션이다.
	
	Properties는 애플리케이션의 옵션정보, 데이터베이스의 연결정보, 그리고 국제화(다국어)정보가
	저장된 프로퍼티파일을 관리할 때 주로 사용한다.
*/
public class PropertiesMain {

	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties();
		
		//properties파일 읽기
		//1. 파일경로확인
		String path = PropertiesMain.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); // 한글이 있을 경우 decoding, Unsupported Exception
		System.out.println("파일경로 = " + path);
		System.out.println();
		
		//2. 파일읽기
		properties.load(new FileReader(path)); //FileNotFoundException, IOException
		
		//3. 키와 값을 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String hangul = properties.getProperty("hangul");
		String mariadb = properties.getProperty("mariadb");
		String mysql = properties.getProperty("mysql");
		
		//4. 값 출력하기
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		System.out.println(hangul);
		System.out.println(mariadb);
		System.out.println(mysql);
	}

}
