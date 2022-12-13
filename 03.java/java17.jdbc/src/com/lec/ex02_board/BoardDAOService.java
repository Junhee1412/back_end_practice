package com.lec.ex02_board;

import java.util.ArrayList;

public interface BoardDAOService {

    void createBoard(); // 글쓰기
	BoardVO viewBoard(int bno); // 본문조회
	void updateBoard(int bno); // 글수정
	void deleteBoard(int bno); // 글삭제
	
	ArrayList<BoardVO> listBoard(); // 전체글조회
	ArrayList<BoardVO> findBySubjectBoard(String subject); // 제목별조회
	ArrayList<BoardVO> findByWriterBoard(String writer); // 작성자별조회
}
