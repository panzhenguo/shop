package com.pan.api.service.impl;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pan.api.service.UserServiceApi;
import com.pan.base.ResponseBase;
import com.pan.entity.User;
import com.pan.repostitory.UserRepository;


@RestController
public class UserServiceApiImpl implements UserServiceApi {
	
	@Autowired
	private UserRepository rep;

	@Override
	public ResponseBase getUserInstanceById() {
		User one = rep.getOne(1);
		
		return new ResponseBase(1,"ok",one);
	}

	@Override
	@Transactional
	public ResponseBase addUserInstance() {
		User u = new User();
		u.setCreateDate(new Date());
		u.setIsAdmin(0);
		u.setName(System.currentTimeMillis()+"");
		rep.save(u);
		return new ResponseBase(1,"ok",null);
	}

}
