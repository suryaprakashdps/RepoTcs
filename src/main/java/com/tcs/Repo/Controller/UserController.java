package com.tcs.Repo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Repo.model.UserVO;
import com.tcs.Repo.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "projects", method = RequestMethod.GET)
	public List<UserVO> list() {

		String username = "testid@gmail.com";

		List<UserVO> userlist = userService.getuser(username);

		//System.out.println("user name" + userlist);
		return userlist;
	}

	@RequestMapping(value = "projects", method = RequestMethod.POST)
	public UserVO create(@RequestBody UserVO uservo) {
		return userService.createuser(uservo);
	}

	@RequestMapping(value = "projects/{id}", method = RequestMethod.GET)
	public UserVO get(@PathVariable int id) {
		return userService.getuserprofile(id);
	}

	@RequestMapping(value = "projects/{id}", method = RequestMethod.PUT)
	public UserVO updateuser(@PathVariable int id, @RequestBody UserVO uservo) {
		return userService.updateuser(id, uservo);
	}

	@RequestMapping(value = "projects/{id}",method = RequestMethod.DELETE)
	public UserVO delete(@PathVariable int id) {
		System.out.println("id for delete is"+id);
		
		return userService.deleteuser(id);
	}
}
