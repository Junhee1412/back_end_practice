package com.lec.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAO {

	private Connection conn = null;
	private PreparedStatement stmt =null;
	private ResultSet rs = null; 
	
	private String insert = "insert into board(seq, title, writer, content) "
							+ " values((select nvl(max(seq), 0)+1 from board t1), ?, ?, ?)";
	private String update = "update board set title=?, content=? where seq=?";
	private String delete = "delete from board where seq=?";
	private String select = "select * from board where seq=?";
	private String bdlist = "select * from board order by seq desc";
	
	public BoardDAO() {
		System.out.println("==> BoardDAO 객체생성!!!!!");
	}
	
	public void insertBoard(BoardVO vo) {
		try {
			conn= JDBCUtil.getConnection();
			stmt=conn.prepareStatement(insert);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
	}

	public void deleteBoard(BoardVO vo) {
		
	}

	public void updateBoard(BoardVO vo) {
	}

	public BoardVO getBoard(BoardVO vo) {
		
		return null;
		
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		
		List<BoardVO> boardList = new ArrayList<>();
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(bdlist);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
		return boardList;
		
	}

}
