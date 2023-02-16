package com.rajeshkawali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rajeshkawali.model.UserInfo;
import com.rajeshkawali.repository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public String addNewUser(UserInfo userInfo) {
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		repository.save(userInfo);
		return "New user added to system";
	}

}
