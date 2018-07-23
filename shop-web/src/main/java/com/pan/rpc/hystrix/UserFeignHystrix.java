//package com.pan.rpc.hystrix;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.pan.base.ResponseBase;
//import com.pan.rpc.UserFeignService;
//
// 由于顶级接口为 包含@RestController 注解  所以此类 继承了 映射地址 所有需要重写映射地址
//@Component
//@RequestMapping("/fallback/demo/api")
//public class UserFeignHystrix implements UserFeignService{
//
//	@Override
//	public ResponseBase getUserInstanceById() {
//		System.out.println("chaosh!!!!!!");
//		return null;
//	}
//
//	@Override
//	public ResponseBase addUserInstance() {
//		System.out.println("chaosh!!!!!!");
//		return null;
//	}
//
//}
