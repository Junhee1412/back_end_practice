package com.lec.jdbc.user.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.jdbc.user.vo.UserVO;

public class UserRowMapper implements RowMapper<UserVO>{

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserVO userVO = new UserVO();
		userVO.setId(rs.getString("id"));
		userVO.setName(rs.getString("name"));
		userVO.setPassword(rs.getString("password"));
		userVO.setRole(rs.getString("role"));
		
		return userVO;
		
	}
	
}
