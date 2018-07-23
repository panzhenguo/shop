package com.pan.controller;

import java.util.Date;

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
	
	
	@RequestMapping("/t")
	public ResponseBase t1(){
		ResponseBase rb= new ResponseBase();
		rb.setData(new Date());
		rb.setMsg("測試！！！！");
		rb.setRtnCode(1);
		return rb;
	}
	
	@RequestMapping("/test1")
	public ResponseBase saveTest1() {
		
		ResponseBase userInstanceById = feign.getUserInstanceById();
		
		return userInstanceById;
	}

}
