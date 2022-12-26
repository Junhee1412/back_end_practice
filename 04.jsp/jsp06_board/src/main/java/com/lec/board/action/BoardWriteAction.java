package com.lec.board.action;

import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.board.service.BoardWriteService;
import com.lec.board.vo.ActionFoward;
import com.lec.board.vo.BoardBean;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// System.out.println("===> 글 등록하기!!!");
		
		ActionFoward forward = null;
		BoardBean board = null;
		String realFolder = "";
		String saveFolder = "C:/Users/Jun Hee/develop/Github/back_end_practice/04.jsp/jsp05_file/upload";
		
		int filesize = 1024*1024*5;
		
		String p = req.getParameter("p");
		String f = req.getParameter("f");
		String q = URLEncoder.encode(req.getParameter("q"), "utf-8");
		
		ServletContext context = req.getServletContext();
		realFolder = context.getRealPath("/boardUpload");
		// System.out.println(realFolder + "\n" + saveFolder);
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest(req, saveFolder, filesize, "utf-8", new DefaultFileRenamePolicy());
			
			board = new BoardBean();
			board.setBoard_name(multi.getParameter("board_name"));
			board.setBoard_pass(multi.getParameter("board_pass"));
			board.setBoard_subject(multi.getParameter("board_subject"));
			board.setBoard_content(multi.getParameter("board_content"));
			board.setBoard_file(multi.getOriginalFileName((String) multi.getFileNames().nextElement()));
			
			System.out.println("==> " + board.getBoard_file());
						
			BoardWriteService boardWriteService = new BoardWriteService();
			boolean isWriteSuccess = boardWriteService.registerBoard(board);
			
			if(isWriteSuccess) {
				forward = new ActionFoward();
				forward.setRedirect(true);
				forward.setPath("boardList.bo?p=" + p + "&f=" + f + "&q=" + q);				
			} else {
				res.setContentType("text/html; charset=UTF-8" );
				PrintWriter out = res.getWriter();
				out.println("<script>");
				out.println("   alert('게시글 등록이 실패했습니다!!')");
				out.println("   history.back();");
				out.println("</script>");				
			}			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			req.setAttribute("msg", "파일크기가 5MB를 초과했습니다!! : "  + e.getMessage());
			forward = new ActionFoward();
			forward.setRedirect(false);
			forward.setPath("error.bo?p=" + p + "&f=" + f + "&q=" + q);	
		}
			return forward;
	}
}



















