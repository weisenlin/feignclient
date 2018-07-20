package com.wsl.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/20 0020
 * 用途：
 * 描述:
 */
@Component
public class FeignServiceFallBack implements FeignService {
    @Override
    public String sayHiForm(@RequestParam(value = "name") String name) {
        return "sorry, "+name + " server is error";
    }
}
