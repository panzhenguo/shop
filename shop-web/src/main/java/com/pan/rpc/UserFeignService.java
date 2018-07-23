package com.pan.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import com.pan.api.service.UserServiceApi;
import com.pan.rpc.hystrix.UserFeignServiceFallBack;

@Component
//@FeignClient(name="member-server",fallback=UserFeignHystrix.class) 该方法需要重写回调映射地址

@FeignClient(name="member-server",fallbackFactory=UserFeignServiceFallBack.class)
public interface UserFeignService extends UserServiceApi {



}
