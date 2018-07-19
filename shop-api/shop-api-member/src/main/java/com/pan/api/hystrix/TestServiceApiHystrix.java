package com.pan.api.hystrix;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.TestServiceApi;

public class TestServiceApiHystrix implements TestServiceApi{

	@Override
	public JSONObject getInstance() {
		JSONObject jo = new JSONObject();
		jo.put("key", "error");
		return jo;
	}

}
