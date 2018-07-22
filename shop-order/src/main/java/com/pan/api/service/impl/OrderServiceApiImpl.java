package com.pan.api.service.impl;


import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.service.OrderServiceApi;
import com.pan.base.ResponseBase;
import com.pan.entity.Order;
import com.pan.repostitory.OrderRepostiory;

@RestController
public class OrderServiceApiImpl implements OrderServiceApi{

	@Autowired
	private OrderRepostiory  rep;
	
	@Override
	@Transactional
	public ResponseBase addInstance() {
		Order o = new Order();
		o.setOrderNo("no_"+System.currentTimeMillis());
		Random r = new Random();
		o.setPrice(r.nextInt(10)*1000);
		Order save = rep.save(o);
		System.out.println(JSONObject.toJSONString(save));
		return null;
	}

}
