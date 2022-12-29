package com.lec.jdbc.board.dao;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.jdbc.board.impl.BoardRowMapper;
import com.lec.jdbc.board.vo.BoardVO;
import com.lec.jdbc.board.vo.PageVO;

@Repository("boardDAO")
public class BoardDAO {
	
	private JdbcTemplate jdbcTemplate;
	

	public void insertBoard(BoardVO boardVO) {
		String sql = "insert into board(title, writer, content, cnt) values(?,?,?,0)";
		
		jdbcTemplate.update(sql, boardVO.getTitle(), boardVO.getWriter(), boardVO.getContent());
	}

	public void deleteBoard(int seq) {
		String sql = "delete from board where seq = ?";
		
		jdbcTemplate.update(sql, seq);
	}

	public void updateBoard(BoardVO boardVO) {
		String sql = "update board set title=?, writer=?, content=? where seq = ?";
		jdbcTemplate.update(sql, boardVO.getTitle(), boardVO.getWriter(), boardVO.getContent(), boardVO.getSeq());
	}

	public BoardVO getBoard(int seq) {

		String sql = "select * from board where seq = ?";
		String sql1 = "update board set cnt=cnt+1 where seq="+seq;
		Object[] args = {seq};
		
		jdbcTemplate.update(sql1);
		return (BoardVO)jdbcTemplate.queryForObject(sql, args, new BoardRowMapper());
	}

	public List<BoardVO> getBoardList(int currentPage, int perPage) {
		
		String sql = "select * from board limit ?, ?";
		Object[] args = {(currentPage-1)*perPage, perPage};
		return jdbcTemplate.query(sql, args, new BoardRowMapper());
		
	}

	public BoardDAO() {
		AbstractApplicationContext container = new  GenericXmlApplicationContext("applicationContext.xml");
		this.jdbcTemplate = (JdbcTemplate) container.getBean("jdbcTemplate");
	}
	
	public PageVO getPageInfo(String tableName, int currentPage, int perPage) {
		
		PageVO pageVO = new PageVO();
		String sql = "select count(*) from " + tableName;
		
		int totalCount = 0;
		int totalPages = 0;
		int startPage = 0;
		int endPage = 0;
		
		totalCount = jdbcTemplate.queryForInt(sql);

		if(totalCount>0) {
			totalPages = (int)(totalCount / perPage) + ((totalCount % perPage == 0) ? 0 : 1);
			startPage = (int)(currentPage / perPage) * perPage + 1 + ((currentPage % perPage == 0) ? -perPage : 0);
			endPage = (startPage >= totalPages) ? totalPages : startPage + perPage - 1;
		}
				
		pageVO.setTotalCount(totalCount);
		pageVO.setTotalPages(totalPages);
		pageVO.setCurrentPage(currentPage);
		pageVO.setStartPage(startPage);
		pageVO.setEndPage(endPage);
			
		return pageVO;
		
	}

}
