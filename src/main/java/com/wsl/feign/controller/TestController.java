package com.wsl.feign.controller;

import com.wsl.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/20 0020
 * 用途：
 * 描述:
 */
@RestController
public class TestController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/testFeign")
    public String testFeign(){
        return feignService.sayHiForm("wsl");
    }
}
