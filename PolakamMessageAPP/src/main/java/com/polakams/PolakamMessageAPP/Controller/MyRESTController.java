package com.polakams.PolakamMessageAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.polakams.PolakamMessageAPP.JPA.IUserRepository;
import com.polakams.PolakamMessageAPP.Model.User;
import com.polakams.PolakamMessageAPP.service.IRegisterUserService;


@RestController
public class MyRESTController {

	@Autowired  
	IRegisterUserService iRegisterUserService;
	
	

	@RequestMapping(value="/pmapp/registeruser",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> print(@RequestBody User User){


		return new ResponseEntity<User>(iRegisterUserService.saveUser(User),HttpStatus.OK);

	}

	@RequestMapping(value="/pmapp/getallusers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<User>> getall(){


		return new ResponseEntity<List<User>>(iRegisterUserService.getAllUsers(),HttpStatus.OK);

	}
	@RequestMapping(value="/pmapp/deleteuser/{userId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> deleteuser(@PathVariable Long userId){


		return new ResponseEntity<User>(iRegisterUserService.deletetUser(userId),HttpStatus.OK);

	}

	

	@RequestMapping(value="/pmapp/getuser/{userId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getuser(@PathVariable Long userId){


		return new ResponseEntity<User>(iRegisterUserService.getUser(userId),HttpStatus.OK);

	}

}
