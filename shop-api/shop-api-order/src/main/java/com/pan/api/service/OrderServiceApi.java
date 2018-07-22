package com.pan.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

import com.pan.base.ResponseBase;


@RequestMapping("/order")
public interface OrderServiceApi {
	@RequestMapping("/addInstance")
	public ResponseBase addInstance();
}
