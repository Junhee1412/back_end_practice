package com.lec.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.mvc.dao.UserDAO;
import com.lec.mvc.vo.UserVO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(UserVO user, HttpSession sess) {
		
		user.setId("admin@gmail.com");
		user.setPassword("12345");
		user.setName("administrator");
		user.setRole("admin");
		
		sess.setAttribute("isLoginSuccess", true);
		
		return "login/login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO userVO, UserDAO userDAO, HttpSession sess) {
		
		UserVO user = userDAO.getUser(userVO.getId());//select * from user where id = "djdjdj"
		
		if(user==null) {
			sess.setAttribute("isLoginSuccess", false);
			return "login/login.jsp";
		}
		if(!user.getPassword().equals(userVO.getPassword())) {
			sess.setAttribute("matchedPassword", false);
			return "login/login.jsp";
		} else {
			sess.setAttribute("matchedPassword", true);
		}
		if(user.getId().equalsIgnoreCase(userVO.getId())) {
			sess.setAttribute("user", user);
			sess.setAttribute("perPage", 10);
			if(user.getRole().equalsIgnoreCase("ADMIN")) {
				sess.setAttribute("isAdmin", true);
			}else {
				sess.setAttribute("isAdmin", false);
			}
			return "login/logout.jsp";
		}
		return "login/login.jsp";
	}
	
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String logout(UserVO userVO, HttpSession sess) {
		sess.invalidate();
		return "index.jsp";
	}
}
