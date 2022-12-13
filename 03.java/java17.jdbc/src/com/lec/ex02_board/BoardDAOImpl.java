package com.lec.ex02_board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService {

	// 사용자가 입력한 게시글을 전달받는 메서드
	
	public BoardVO inputBoard() {
		
		BoardVO bd = new BoardVO();
		
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요!");
		String writer = JOptionPane.showInputDialog("작성자를 입력하세요!");
		String content = JOptionPane.showInputDialog("글내용을 입력하세요!");
		
		bd.setSubject(subject);
		bd.setWriter(writer);
		bd.setContent(content);
		
		return bd;
	}
	
	@Override
	public void createBoard() {
		BoardVO bd = inputBoard();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getInsert();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd.getSubject());
			pstmt.setString(2, bd.getWriter());
			pstmt.setString(3, bd.getContent());
			int row = pstmt.executeUpdate();
			System.out.println("게시글 " + row + " 건이 성공적으로 등록되었습니다!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
	}

	@Override
	public BoardVO viewBoard(int bno) { 
		
		BoardVO bd = new BoardVO();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getSelect() + " where bno = " + bno;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bd.setBno(bno);
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
			} else {
				System.out.println("글 번호(" + bno + ") - 조회된 글이 없습니다!");
			}
		} catch (SQLException e) {
			System.out.println("게시글 조회 실패!!!");
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
		return bd;
	}

	@Override
	public void updateBoard(int bno) {
		
		BoardVO bd = inputBoard();
	
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getUpdate();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd.getSubject());
			pstmt.setString(2, bd.getWriter());
			pstmt.setString(3, bd.getContent());
			pstmt.setInt(4, bno);
			int row = pstmt.executeUpdate();
			System.out.println("글번호(" + bno + ") - 게시글이 성공적으로 수정되었습니다!");
		} catch (SQLException e) {
			System.out.println("게시글 수정 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
	}
	@Override
	public void deleteBoard(int bno) {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getDelete();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int row = pstmt.executeUpdate();
			System.out.println("글번호(" + row + ") - 게시글이 성공적으로 제거되었습니다!");
		} catch (SQLException e) {
			System.out.println("게시글 제거 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
	}

	@Override
	public ArrayList<BoardVO> listBoard() { 
		
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getSelect();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO bd = new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				boardList.add(bd);
			}
		} catch (SQLException e) {
			System.out.println("게시글 목록 조회 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
		return boardList;
	}

	@Override
	public ArrayList<BoardVO> findBySubjectBoard(String subject) { 
		
		ArrayList<BoardVO> BoardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getSelect()+" where subject like '%" + subject + "%' order by bno desc";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO bd = new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				BoardList.add(bd);
				System.out.println(bd);
			}
		} catch (SQLException e) {
			System.out.println("게시글 검색 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// dummy
			}
		}return BoardList;
	}

	@Override
	public ArrayList<BoardVO> findByWriterBoard(String writer) { 
		ArrayList<BoardVO> BoardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		String sql = cf.getSelect()+" where writer like '%" + writer + "%' order by bno desc";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO bd = new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				BoardList.add(bd);
				System.out.println(bd);
			}
		} catch (SQLException e) {
			System.out.println("게시글 검색 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// dummy
			}
		}return BoardList;
	}

}
