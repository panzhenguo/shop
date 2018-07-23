package com.pan.rpc.hystrix;

import org.springframework.stereotype.Component;

import com.pan.base.ResponseBase;
import com.pan.entity.User;
import com.pan.rpc.UserFeignService;

import feign.hystrix.FallbackFactory;

@Component
public class UserFeignServiceFallBack implements FallbackFactory<UserFeignService> {

	 @Override
	  public UserFeignService create(Throwable cause) {
	    return new UserFeignService() {

			@Override
			public ResponseBase getUserInstanceById() {
				System.out.println("-----------");
				return null;
			}

			@Override
			public ResponseBase addUserInstance() {
				System.out.println("-----------");
				return null;
			}
	    
	    };
	  }

}
