package com.wsl.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/20 0020
 * 用途：通过fallback属性设置熔断机制，当微服务无法访问的时候访问其他接口返回信息   FeignServiceFallBack 实现当前接口并注解交给spring 管理
 * 描述:
 */
@FeignClient(value = "service-hi",fallback = FeignServiceFallBack.class)
public interface FeignService {

    @RequestMapping(value = "/hi")
    String sayHiForm(@RequestParam(value = "name") String name);
}
