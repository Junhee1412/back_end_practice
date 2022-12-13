package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		//1. ArrayList - Member
		List<Member> members = new ArrayList<>();
		//insert into member values();
		members.add(new Member(1, "홍길동", "12345", "hong1@gmail.com"));
		members.add(new Member(2, "홍길순", "12345", "hong2@gmail.com"));
		members.add(new Member(3, "홍길자", "12345", "hong3@gmail.com"));
		members.add(new Member(4, "홍길녀", "12345", "hong4@gmail.com"));
		members.add(new Member(5, "홍길상", "12345", "hong5@gmail.com"));
		for(Member member:members) {
			System.out.println(member.id);
		}
		System.out.println();
		
		//실습. board를 5건 추가, 2번째 데이터를 삭제, 출력
		// 2. Vector - Board
		List<Board> boards = new Vector<>();
		// insert into board values()
		// select * from member, board member.id = board.writer) 
		boards.add(new Board(1, "제목1", "홍길동", "코로나 조심하세!!"));
		boards.add(new Board(2, "제목2", "홍길순", "브라질 vs 대한민국!!"));
		boards.add(new Board(3, "제목3", "홍길상", "잉글랜드 vs 프랑스"));
		boards.add(new Board(4, "제목4", "홍길녀", "코로나 조심하세!!"));
		boards.add(new Board(5, "제목5", "홍길자", "코로나 조심하세!!"));
		
		for(Board board:boards) {
			System.out.println(board.toString());
		}
		System.out.println();
		
		// delete from board where board.bno = 2;
		boards.remove(1);
		
		// select * from board where 1 and 10;
		for(int i=0;i<boards.size();i++) {
			Board board = boards.get(i);
			// html에 table태그에 출력하는 방법?
			System.out.println(board.toString());
		}
	}

}

class Member{
	int id;
	String pw;
	String name;
	String email;
	public Member(int id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", "
				+ "hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

class Board{
	int bno;
	String title;
	String writer;
	String content;
	
	public Board(int bno, String title, String writer, String content) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
	
}