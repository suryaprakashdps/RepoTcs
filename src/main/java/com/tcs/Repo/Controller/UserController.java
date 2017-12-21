package com.tcs.Repo.Controller;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Repo.model.MasterVO;
import com.tcs.Repo.model.ProjectionVO;
import com.tcs.Repo.model.UserVO;
import com.tcs.Repo.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "projects", method = RequestMethod.GET)
	public List<MasterVO> masterList() {
		
		List<MasterVO> master_data = userService.getmasterdata();

		//String username = "testid@gmail.com";

		//List<UserVO> userlist = userService.getuser(username);

		//System.out.println("user name" + userlist);
		return master_data;
	}

	@RequestMapping(value = "projects", method = RequestMethod.POST)
	public MasterVO create(@RequestBody MasterVO mastervo) {
		return userService.createproj(mastervo);
	}

	@RequestMapping(value = "projects/{id}", method = RequestMethod.GET)
	public UserVO get(@PathVariable int id) {
		return userService.getuserprofile(id);
	}

	@RequestMapping(value = "projects", method = RequestMethod.PUT)
	public void updateuser( @RequestBody MasterVO mastervo) {
		System.out.println("inside update user controller java"+mastervo.getRec_key());
		System.out.println("inside update user controller java"+mastervo.getProject());
		//return "success";
		
	
				
				userService.updatemasterdata(mastervo);
	}

	@RequestMapping(value = "projects/{id}",method = RequestMethod.DELETE)
	public UserVO delete(@PathVariable int id) {
		System.out.println("id for delete is"+id);
		
		return userService.deleteuser(id);
	}
	
	@RequestMapping(value = "projection", method = RequestMethod.GET)
	public List<ProjectionVO> projectionList() {
		
		List<ProjectionVO> master_data = userService.getProjectionData();

		return master_data;
	}
	
	@RequestMapping(value = "projection", method = RequestMethod.POST)
	public ProjectionVO create(@RequestBody ProjectionVO projectionvo) {
		System.out.println("inside update user controller java"+projectionvo.getRec_key());
		System.out.println("inside update user controller java"+projectionvo.getTower());
		/*List futureDate = new ArrayList();
		futureDate = userService.getDateList(projectionvo);
		for(Object futureObj : futureDate)
		{
			Map<String,Object> dateMap = (Map<String,Object>) futureObj;
			projectionvo.setMonth(((String)dateMap.get("month_name_abbreviated")));
			projectionvo.setYear(((Integer)dateMap.get("year_actual")));
			userService.createProjecton(projectionvo);
		}*/
		return userService.createProjecton(projectionvo);
	}


	@RequestMapping(value = "projection", method = RequestMethod.PUT)
	public void updateprojection( @RequestBody ProjectionVO projectionvo) {
		System.out.println("inside update user controller java"+projectionvo.getRec_key());
		System.out.println("inside update user controller java"+projectionvo.getTower());
		//return "success";
		
	
				
				userService.updateProjection(projectionvo);
	}


}
