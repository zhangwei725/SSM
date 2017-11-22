package com.werner.ssm.mapper;

import com.werner.ssm.domain.entity.User;
import com.werner.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"
        , "classpath:spring-mvc.xml"
        , "classpath:spring-mybatis.xml"
        , "classpath:spring-tx.xml"})
public class UserMapperTest {
    @Resource(name = "userService")
    private IUserService userService;
    @Resource
    private  UserMapper userMapper;
    @Test
    public void getAllUsers() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setAge(12);
        user.setName("测试");
        user.setPassword("123456");
        userService.register(user);
    }

    @Test
    public void getUser() throws Exception {
        User user = userMapper.getUser(1);
        System.out.println(user.toString());

    }



}