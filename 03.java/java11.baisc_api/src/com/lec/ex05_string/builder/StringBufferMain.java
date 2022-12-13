package com.lec.ex05_string.builder;

/*
	
	StringBuffer, StringBuilder 클래스
	
	문자열을 저장하는 Strung클래스는 내부의 문자열을 수정할 수 없다. 예를 들어서 String.relace()
	메서드는 내부의 문자열을 변경하는 것이 아니라 새롭게 대체된 문자열객체를 리턴한다.
	또한 예를 들어 "JAVA" + "PROGRAMMING"을 실행하는 경우 내부문자열을 수정할 수 없기 때문에 
	"JAVA PROGRMMING"이라는 새로운 String객체를 생성한 후에 그 객체의 참조번지를 리턴한다. 문자열
	을 결합할 경우 "+"연결연산자를 사용하면 할 수록 그 사용수 만큼 새로운 String객체의 수가 늘어
	나기 때문에 프로그램의 성능을 느리게하는 요인이 된다.
	
	따라서, 문자열 변경작업이 많을 경우에는 String클래스 대신에 java.lang.StringBuilder or StringBuffer
	클래스를 사용하는 것이 좋다. 이 두 클래스는 내부버퍼(buffer, 데이타를 임시로 저장하는 메모리)에 
	문자열을 저장해 두고 그 안에서 수정, 추가, 삭제등의 작업을 할 수 있도록 한다. String처럼 새로운
	객체를 만들지 않고 문자열을 조작할 수 있다는 장점이 있다.
	
	StringBuffer나 StringBuilder의 사용법은 동일한데 차이점은 StringBuffer는 멀티쓰레드환경에서 사용
	할 수 있도록 동기화가 적용이 되어 있는 쓰레드(Thread)에 안전하지만 StringBuilder는 안전하지 못해
	단일 쓰레드환경에서만 사용하도록 설계되어 있다.
	
	StringBuffer, StringBuilder 메서드
	
	1. append : 문자열 끝에 매개값으로 주어진 문자열 추가
	2. insert : 문자열 사이에 매개값으로 주어진 문자열을 삽입
	3. delete : 매개값으로 주어진 문자열을 삭제
	4. deleteCharAt : 문자열에서 주어진 위치(index)의 문자를 삭제
	5. replace : 다른 문자열로 변경
	6. reverse : 문자열을 그대로 뒤집기
	7. setCharAt : 문자열에서 주어진 위치(index)의 문자열을 다른 문자로 변경

*/

public class StringBufferMain {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode() + "," + sb);
		
		//1. append
		sb.append("JAVA ");
		sb.append("Program");
		System.out.println(sb.hashCode() + "," +sb);
		
		//2. insert
		sb.insert(5, "홍길동 ");
		System.out.println(sb.hashCode() + "," +sb);
		
		//3. delete
		sb.delete(5, 6);
		System.out.println(sb.hashCode() + "," +sb);
		
		//4. deleteCharAt
		sb.deleteCharAt(4);
		System.out.println(sb.hashCode() + "," +sb);
		
		//5. replace
		sb.replace(4, 6, "소향");
		System.out.println(sb.hashCode() + "," +sb);
		
		//6. reverse
		sb.reverse();
		System.out.println(sb.hashCode() + "," +sb);

		//7. setCharAt
		sb.setCharAt(6, 'X');
		System.out.println(sb.hashCode() + "," +sb);

		//8. 문자열의 갯수
		System.out.println(sb.hashCode() + "," +sb.reverse()+", 문자열의 총 갯수 = " +sb.length());
		
		//9. StringBuffer를 String타입으로 형변환
		String result = sb.toString();
		System.out.println(result.hashCode()+","+result.getClass());
		
		//10. String을 StringBuffer 타입으로 형변환
		StringBuffer sb1 = new StringBuffer(result);
		System.out.println(sb1.hashCode()+ ","+ sb1.getClass());
	}

}
