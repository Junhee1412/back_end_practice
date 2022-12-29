package com.lec.jdbc.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.jdbc.board.vo.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO>{

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setSeq(rs.getInt("seq"));
		boardVO.setTitle(rs.getString("title"));
		boardVO.setWriter(rs.getString("writer"));
		boardVO.setContent(rs.getString("content"));
		boardVO.setRegdate(rs.getDate("regdate"));
		boardVO.setCnt(rs.getInt("cnt"));
		
		return boardVO;
		
	}
	
}
