package com.lec.ex02_board;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardMenu {

	private double ver;
	
	public BoardMenu(double ver) {
		this.ver = ver;
	}

	public void mainBoardMenu() {
		
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUI();
			
			switch(menuNo) {
			case 0: System.out.println("프로그램종료!!"); System.exit(0); break;
			case 1: makeBoard(bddao); break;
			case 2: listBoard(bddao); break;
			case 3: contentView(bddao); break;
			case 4: updateBoard(bddao); break;
			// 실습
			// delete는 글번호입력
			// findBySubject는 제목을 입력 , where like 조건 추가, 글번호 desc
			// findByWriter는 작성자 입력 , where like 조건 추가, 글번호 desc
			case 5: deleteBoard(bddao); break;
			case 6: findBySubject(bddao); break;
			case 7: findByWriter(bddao);
			}
		}
	}
	
	public void findByWriter(BoardDAOImpl bddao) {
		
		String bno = JOptionPane.showInputDialog("작성자를 입력하세요");
		
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			System.out.println("============================================================");
			System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
			System.out.println("============================================================");
			bddao.findByWriterBoard(bno);	
		}
	}
	
	public void findBySubject(BoardDAOImpl bddao) {
		
		String bno = JOptionPane.showInputDialog("글제목을 입력하세요");
		
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			System.out.println("============================================================");
			System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
			System.out.println("============================================================");
			bddao.findBySubjectBoard(bno);	
		}
	}
	public void deleteBoard(BoardDAOImpl bddao) {
		
		String bno = JOptionPane.showInputDialog("제거할 글 번호를 입력하세요!");
		
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			bddao.deleteBoard(Integer.parseInt(bno));	
		}
	}
	
	public void updateBoard(BoardDAOImpl bddao) {
		
		String bno = JOptionPane.showInputDialog("수정할 글 번호를 입력하세요!");
		
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			bddao.updateBoard(Integer.parseInt(bno));	
		}
	}

	public void contentView(BoardDAOImpl bddao) {
		
		String bno = JOptionPane.showInputDialog("조회할 글 번호를 입력하세요!");
		
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			BoardVO bd = bddao.viewBoard(Integer.parseInt(bno));
			System.out.println("글제목 : " + bd.getSubject());
			System.out.println("작성자 : " + bd.getWriter());
			System.out.println("글내용 : " + bd.getContent() + "\n\n");
		}
	}

	public void listBoard(BoardDAOImpl bddao) {
		
		ArrayList<BoardVO> boardList = bddao.listBoard();
		
		System.out.println("============================================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("============================================================");
		
		for(BoardVO board:boardList) {
			System.out.println(board.toString());
		}
		System.out.println("------ 출력종료 ------\n\n");
	}

	public void makeBoard(BoardDAOImpl bddao) {
		bddao.createBoard();
	}

	public int mainMenuUI() {
		
		String menuNo = JOptionPane.showInputDialog(
				"==== 게시판관리프로그램 V" + this.ver + " ====\n\n" +
			    "1. 새로운 글쓰기 \n" +
			    "2. 전체글 목록조회 \n" +
			    "3. 본문글 보기 \n" +
			    "4. 본문글 수정 \n" +
			    "5. 본문글 삭제 \n" +
			    "6. 제목으로 게시글 조회 \n" +
			    "7. 작성자로 게시글 조회 \n" +
			    "0. 종료 \n\n" +
			    "처리할 작업번호를 입력하세요!!!"
			);
		if ((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);
		}
	}	
}
