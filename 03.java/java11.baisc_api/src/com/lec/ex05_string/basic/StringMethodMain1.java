package com.lec.ex05_string.basic;

public class StringMethodMain1 {

	public static void main(String[] args) {
		//1. replace
		String oldstr = "자바 프로그래밍";
		String newstr = oldstr.replace("자바", "JAVA");
		System.out.println(newstr);
		System.out.println(oldstr.hashCode()+" : " + newstr.hashCode());
		System.out.println(oldstr.toString()+" : " + newstr.toString());
		oldstr= oldstr.replace("자바", "python");
		System.out.println(oldstr + ":" + oldstr.hashCode());
		
		//2. substring
		// 1) substring(int from, int to) : from~to-1까지의 문자를 추출
		// 2) substring(int from)         : from~문자열끝까지의 문자를 추출
		String ssn = "951118-1234567";
		String birthday= ssn.substring(0, 6);
		String sno = ssn.substring(7);
		String gender = ssn.substring(7, 8);
		System.out.println("생년월일=" + birthday + ", 주민번호=" + sno + ", " + (gender.equals("1") ? "남자" : "여자"));
		System.out.println();
		
		//3. toLowerCase, toUpperCase
		
		String str1 = "java programming";
		String str2 = "JAVA PROGRAMMING";
		System.out.println(str1.toUpperCase()+ " : " + str1 + str1.hashCode());
		str1= str1.toUpperCase();
		System.out.println(str1);
		System.out.println(str2.toLowerCase() + " : " + str2);
		System.out.println();
		
		// 대소문자의 동등비교
		str1 = "java programming";
		str2 = "JAVA PROGRAMMING";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자구분없이 값이 같은지
		System.out.println();
		
		//4. trim : 앞뒤의 공백을 제거
		String tel1 = "   02";
		String tel2 = "1234   ";
		String tel3 = "   02  1234   ";
		System.out.println(tel1.trim().hashCode()+","+tel1.hashCode()+","+tel2.trim()+","+tel3.trim());
		System.out.println(tel2);
		System.out.println();
		
		//5. valueOf : int, double등의 기본타입을 문자열로 변환하는 메서드
		String val1 = String.valueOf(false);
		String val2 = String.valueOf(10);
		String val3 = String.valueOf(3.14);
		System.out.println(val2 + val3);

	}

}
