package com.lec.ex02_board;

public class BoardFactory {
	
	// 실습. BoaradDAOImpl을 싱글톤으로 작성
	// 1. BoardFactory 생성자를 외부에서 생성못하도록 금지
	// 2. BoardDAOImpl을 싱글톤으로 작성
	//    1) BoardDAOImpl을 private, static
	//    2) BoardDAOImpl을 리턴할 getter 메서드 getInstance()를 작성
	
	private BoardFactory() {}
	private static BoardDAOImpl bddao = null;
	public static BoardDAOImpl getInstance() {
		if(bddao==null) bddao = new BoardDAOImpl();
		return bddao;
	}
}
