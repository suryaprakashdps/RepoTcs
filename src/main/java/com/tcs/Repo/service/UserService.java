package com.tcs.Repo.service;

import java.math.BigInteger;
import java.util.List;

import com.tcs.Repo.model.MasterVO;
import com.tcs.Repo.model.UserVO;

public interface UserService {
	
	List<UserVO> getuser(String username);

	UserVO createuser(UserVO uservo);

	UserVO updateuser(int id, UserVO uservo);

	UserVO deleteuser(int id);

	UserVO getuserprofile(int id);

	List<MasterVO> getmasterdata();

	MasterVO updatemasterdata(MasterVO mastervo);
	
	MasterVO createproj(MasterVO mastervo);

}
