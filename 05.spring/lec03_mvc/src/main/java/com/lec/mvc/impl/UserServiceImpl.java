package com.lec.mvc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.mvc.dao.UserDAO;
import com.lec.mvc.db.JDBCUtility;
import com.lec.mvc.service.UserService;
import com.lec.mvc.vo.PageInfo;
import com.lec.mvc.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	@Override
	public int insertUser(UserVO user) {
		
		return userDAO.insertUser(user);
		
	}

	@Override
	public int deleteUser(String id) {
		
		return userDAO.deleteUser(id);
		
	}

	@Override
	public int updateUser(String id) {
		
		return 0;
		
	}

	@Override
	public UserVO selectUser(String id) {
		
		return null;
		
	}

	@Override
	public List<UserVO> getUserList(int currentPage, int perPage) {
		
		UserVO userVO = null;
		List<UserVO> userList = new ArrayList<>();
		String sql = "select * from user limit ?, ?";
		
		
		
		try {
			conn = JDBCUtility.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, (currentPage-1) * perPage);
			stmt.setInt(2, perPage);
			rs=stmt.executeQuery();
			while(rs.next()) {
	            userVO=new UserVO();
	            userVO.setId(rs.getString("id"));
	            userVO.setName(rs.getString("name"));
	            userVO.setPassword(rs.getString("password"));
	            userVO.setRole(rs.getString("role"));
	            userList.add(userVO);
	         }
	      }catch(Exception e) {
	         System.out.println("db 접 실패 "+e.getMessage());
	      }finally {
	         JDBCUtility.close(conn, stmt, rs);
	      }
	      return userList;
	   }
	

	@Override
	public PageInfo getPageInfo(int currentPage, int perPage) {
		
		return null;
		
	}

}
