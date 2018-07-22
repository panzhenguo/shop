package com.pan.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import com.pan.api.service.UserServiceApi;

@Component
@FeignClient(name="member-server")
public interface UserFeignService extends UserServiceApi {



}
