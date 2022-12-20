package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String[] hobbies = req.getParameterValues("hobbies");
		String majors = req.getParameter("majors");
		String protocol = req.getParameter("protocol");
		
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = res.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>Login Servlet</title></head>");
		writer.println("<body>");
		writer.println("아이디 = "+id+"<br>");
		writer.println("비밀번호 = "+pw+"<br>");
		writer.println("취미 = "+Arrays.toString(hobbies)+"<br>");
		writer.println("과목 = "+majors+"<br>");
		writer.println("프로토콜 = "+protocol+"<br>");
		writer.println("</body>");
		writer.println("</html>");
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		doGet(req, res);
	}
}
