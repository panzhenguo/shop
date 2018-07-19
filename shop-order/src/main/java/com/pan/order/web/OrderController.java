package com.pan.order.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.TestServiceApi;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/getInstance")
	public JSONObject getInstance() {
		JSONObject jo = new JSONObject();
		jo.put("key", "order");
		return jo;
	}
	
	@Autowired
	private TestServiceApi testServiceApi;
	
	@RequestMapping("/getRPC")
	public JSONObject getRPC() {
		
		System.out.println(testServiceApi);
		return null;
	}
	
}
