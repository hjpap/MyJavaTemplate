package com.wei.zuba.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.wei.zuba.entity.User;


@Service
public class CustomerService {

	public User findCustInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail("aaa@aaa.com");
		user.setPassword("xxxx");
		user.setId(1);
		user.setLoginName("xxx");
		user.setEnableStatus(false);
		user.setUserName("xxxx");
		return user;
	}
	
}
