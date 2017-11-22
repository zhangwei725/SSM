package com.werner.ssm;


import com.alibaba.fastjson.JSONObject;
import com.werner.ssm.domain.entity.User;

/**
 * @author zhangwei
 */
public class TestMain {

    public static void main(String[] args) {
//        {"age":18,"name":"测试","password":"123456"}
        User user = new User();
        user.setName("测试");
        user.setAge(18);
        user.setPassword("123456");
        String s = JSONObject.toJSONString(user);
        System.out.println(s);


    }

}
