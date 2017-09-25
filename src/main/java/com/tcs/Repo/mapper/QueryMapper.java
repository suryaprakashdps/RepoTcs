package com.tcs.Repo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tcs.Repo.model.UserVO;

@Mapper
public interface QueryMapper {
	
	public List<UserVO> getuserprof();

	public UserVO getuserprofile(int id);

	public void createuser(UserVO uservo);

}
