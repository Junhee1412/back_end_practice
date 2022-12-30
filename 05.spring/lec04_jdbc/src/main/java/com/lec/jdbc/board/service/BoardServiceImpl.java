package com.lec.jdbc.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.jdbc.board.dao.BoardDAO;
import com.lec.jdbc.board.impl.BoardService;
import com.lec.jdbc.board.vo.BoardVO;
import com.lec.jdbc.board.vo.PageVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}

	@Override
	public void deleteBoard(int seq) {
		boardDAO.deleteBoard(seq);
	}

	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}

	@Override
	public BoardVO selectBoard(int seq) {
		return boardDAO.getBoard(seq);
	}
	
	@Override
	public void countUp(int seq) {
		boardDAO.countUp(seq);
	}
	
	@Override
	public List<BoardVO> getBoardList(int currentPage, int perPage) {
		return boardDAO.getBoardList(currentPage, perPage);
	}

	@Override
	public PageVO getPageVO(int currentPage, int perPage) {
		return boardDAO.getPageInfo("board", currentPage, perPage);
	}

	
}
