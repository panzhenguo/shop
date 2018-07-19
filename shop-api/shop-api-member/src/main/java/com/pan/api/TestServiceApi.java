package com.pan.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.hystrix.TestServiceApiHystrix;

@RequestMapping("/test")
@FeignClient(name= "spring-cloud-producer",fallback=TestServiceApiHystrix.class)
public interface TestServiceApi {
	
	@RequestMapping("/getInstance")
	public JSONObject getInstance();
}
