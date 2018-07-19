package com.pan.api.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.TestServiceApi;

@RestController
public class TestServiceApiImpl implements TestServiceApi {

	@Override
	public JSONObject getInstance() {
		JSONObject jo = new JSONObject();
		jo.put("key", "member");
		return jo;
	}

}
