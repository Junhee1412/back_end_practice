package com.lec.jdbc.board.impl;

import java.util.List;

import com.lec.jdbc.board.vo.BoardVO;
import com.lec.jdbc.board.vo.PageVO;

public interface BoardService {
	
	void insertBoard(BoardVO boardVO);
	void deleteBoard(int seq);
	void updateBoard(BoardVO boardVO);
	void countUp(int seq);
	BoardVO selectBoard(int seq);
	List<BoardVO> getBoardList(int currentPage, int perPage);
	PageVO getPageVO(int currentPage, int perPage);
	
}
