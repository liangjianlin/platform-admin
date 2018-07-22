package cn.com.ljl.web.controller;

import cn.com.ljl.commonservicefacade.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(@RequestParam("name") String name) {
        return userService.login(name);
    }

}
