package com.example.lanjieqi;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/admin", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
    // 配置注解权限, 允许身份为admin, 或者说允许权限为admin的人访问
    @Access()
    public String hello() {
        return "Hello, admin";
    }
}
