package com.tcs.Repo.Controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Repo.model.MasterVO;
import com.tcs.Repo.model.UserVO;
import com.tcs.Repo.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "projects", method = RequestMethod.GET)
	public List<MasterVO> list() {
		
		List<MasterVO> master_data = userService.getmasterdata();

		//String username = "testid@gmail.com";

		//List<UserVO> userlist = userService.getuser(username);

		//System.out.println("user name" + userlist);
		return master_data;
	}

	@RequestMapping(value = "projects", method = RequestMethod.POST)
	public UserVO create(@RequestBody UserVO uservo) {
		return userService.createuser(uservo);
	}

	@RequestMapping(value = "projects/{id}", method = RequestMethod.GET)
	public UserVO get(@PathVariable int id) {
		return userService.getuserprofile(id);
	}

	@RequestMapping(value = "projects", method = RequestMethod.PUT)
	public void updateuser( @RequestBody MasterVO mastervo) {
		System.out.println("inside update user controller java"+mastervo.getRec_key());
		//return "success";
		
	
				
				userService.updatemasterdata(mastervo);
	}

	@RequestMapping(value = "projects/{id}",method = RequestMethod.DELETE)
	public UserVO delete(@PathVariable int id) {
		System.out.println("id for delete is"+id);
		
		return userService.deleteuser(id);
	}
}
