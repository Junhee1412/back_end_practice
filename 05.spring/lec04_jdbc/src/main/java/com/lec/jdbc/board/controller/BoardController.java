package com.lec.jdbc.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lec.jdbc.board.impl.BoardService;
import com.lec.jdbc.board.vo.BoardVO;
import com.lec.jdbc.board.vo.PageVO;

@Controller("boardController")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("boardList.bo") 
	public String getBoardList(BoardVO boardVO, Model model,
			@RequestParam(defaultValue="1") int p,
			@RequestParam(defaultValue="10") int perPage) {
		PageVO pageVO = boardService.getPageVO(p, perPage);
		model.addAttribute("pageVO", pageVO);
		model.addAttribute("boardList", boardService.getBoardList(p, perPage));
		return "board/board_list.jsp";
	}
	
	@RequestMapping(value="board/insertBoard.bo", method=RequestMethod.POST)
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "../boardList.bo";
	}
	
	@RequestMapping(value="deleteBoard.bo", method=RequestMethod.GET)
	public String deleteBoardView(@RequestParam int seq) {
		return "board/board_delete.jsp?seq="+seq;
	}
	
	@RequestMapping(value="deleteBoard.bo", method=RequestMethod.POST)
	public String deleteBoard(@RequestParam int seq) {
		boardService.deleteBoard(seq);
		return "boardList.bo";
	}
	
	@RequestMapping(value="updateBoard.bo", method=RequestMethod.GET)
	public String updateBoard(Model model, @RequestParam int seq) {
		model.addAttribute("board", boardService.selectBoard(seq));
		return "board/board_update.jsp?seq="+seq;
	}
	
	@RequestMapping(value="updateBoard.bo", method=RequestMethod.POST)
	public String updateBoard(BoardVO boardVO) { 
		boardService.updateBoard(boardVO);
		return "boardList.bo";
		}
	
	@RequestMapping(value="selectBoard.bo", method=RequestMethod.GET)
	public String selectBoard(@RequestParam int seq, Model model) { 
		model.addAttribute("board", boardService.selectBoard(seq));
		boardService.selectBoard(seq);
		boardService.countUp(seq);
		return "board/board_select.jsp?seq="+seq;
		}
}
