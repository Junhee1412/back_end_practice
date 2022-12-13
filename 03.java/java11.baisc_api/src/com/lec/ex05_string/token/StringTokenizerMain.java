package com.lec.ex05_string.token;

import java.util.StringTokenizer;

/*
	StringTokenizer클래스
	
	문자열이 특정 구분자(delimiter)로 연결이 되어 있는 경우 구분자를 기준으로 문자열을
	분리하기 위해서는 String.split(re)을 이용하거나 java.util.StringTokenizer클래스를
	이용할 수 있다.
	
	String.split(re)은 정규표현식(re, Regular Expression)으로 분리하지만 StringTokenizer
	는 문자(구분자)로 구분한다. 문자열이 한 종류의 구분자로 연결이 되어 있을 경우에는 
	StringTokenizer를 이용하면 쉽게 문자열(token)을 분리할 수가 있다. 
	
	StringTokenize의 메서드
	
	1. countToken()  : 현재 남아 있는 token의 갯수를 int로 리턴
	2. hasMoreToken(): 남아 있는 token이 있는지 여부를 boolean으로 리턴
	3. nextToken()   : token을 하나씩 거내는 메서드, String으로 리턴
	   ... nextToken()메서드는 더 이상 꺼내올 token이 없을 경우 NoSuchElementException
	       예외를 발생시킨다. 따라서, 예외처리를 해야 한다.
*/

public class StringTokenizerMain {

	public static void main(String[] args) {
		String text = "홍길동/홍길순/홍길자/홍길녀/홍길라";
		StringTokenizer st = new StringTokenizer(text,"/");
		int count = st.countTokens();
		System.out.println("현재 token의 갯수 = " + count);
		System.out.println("현재 token이 남아 있는지 여부 = " + st.hasMoreElements());
		System.out.println();
		
		String str = st.nextToken();
		System.out.println("꺼내온 token = " + str);
		System.out.println("현재 token의 갯수 = " + st.countTokens());
		System.out.println("현재 token이 남아 있는지 여부 = " + st.hasMoreElements());
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		System.out.println("현재 token의 갯수 = " + st.countTokens());
		
		//1. for
		count = st.countTokens();
		for(int i=0; i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		// System.out.println(st.nextToken()); 더 꺼낼 수 있는 토큰이 없어서 에러
		System.out.println("현재 token의 갯수 = " + st.countTokens());
		System.out.println("현재 token이 남아 있는지 여부 = " + st.hasMoreElements());
		System.out.println();
		st = new StringTokenizer(text, "/");
		//2. while
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("현재 token의 갯수 = " + st.countTokens());
		System.out.println("현재 token이 남아 있는지 여부 = " + st.hasMoreElements());
		
	}

}
