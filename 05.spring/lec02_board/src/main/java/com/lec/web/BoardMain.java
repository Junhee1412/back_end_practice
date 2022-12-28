package com.lec.web;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {

		
		
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService = (BoardService) factory.getBean("boardService");

		BoardVO board = new BoardVO();

		board.setTitle("임시제목입니다."); board.setWriter("임시작성자입니다.");
		board.setContent("임시글입니다.");
		
		boardService.insertBoard(board);
		
		List<BoardVO> boardList = boardService.getBoardList(board);

		for (BoardVO bd : boardList) {
			System.out.println(bd.toString());
		}

		factory.close();
	}

}
