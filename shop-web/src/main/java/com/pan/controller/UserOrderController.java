package com.pan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pan.base.ResponseBase;
import com.pan.rpc.UserFeignService;

@RestController
@RequestMapping("/urc")
public class UserOrderController {
	
	@Autowired
	private UserFeignService feign;
	
	@RequestMapping("/test1")
	public ResponseBase saveTest1() {
		
		ResponseBase userInstanceById = feign.getUserInstanceById();
		
		return userInstanceById;
	}

}
