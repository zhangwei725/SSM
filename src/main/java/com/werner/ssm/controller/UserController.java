package com.werner.ssm.controller;

import com.werner.ssm.domain.entity.User;
import com.werner.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author zhangwei
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    IUserService userService;

    @RequestMapping(value = "/register", method = {POST, GET})
    public User register() {
        User user = new User();
        user.setName("测试");
        user.setAge(18);
        user.setPassword("123456");
        return user;
    }
}
