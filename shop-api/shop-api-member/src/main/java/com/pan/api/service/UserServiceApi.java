package com.pan.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

import com.pan.base.ResponseBase;

@RequestMapping("/user")
public interface UserServiceApi {
	
	@RequestMapping("/getUserInstance")
	public ResponseBase getUserInstanceById();
	
	@RequestMapping("/addUserInstace")
	public ResponseBase addUserInstance();

}
