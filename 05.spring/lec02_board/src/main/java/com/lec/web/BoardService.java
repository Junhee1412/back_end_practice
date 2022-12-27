package com.lec.web;

import java.util.List;

public interface BoardService {
	
	void insertBoard(BoardVO vo);
	void deleteBoard(BoardVO vo);
	void updateBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
	
}
