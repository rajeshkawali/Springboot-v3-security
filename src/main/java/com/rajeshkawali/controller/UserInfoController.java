package com.rajeshkawali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.UserInfo;
import com.rajeshkawali.service.UserInfoService;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@RestController
@RequestMapping("/api/v1/security")
public class UserInfoController {

	
	@Autowired
	private UserInfoService service;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the spring boot version 3.0 and spring security new updates";
	}

	@PostMapping("/addNewUser")
	public String addNewUser(@RequestBody UserInfo userInfo) {
		return service.addNewUser(userInfo);
	}
}
