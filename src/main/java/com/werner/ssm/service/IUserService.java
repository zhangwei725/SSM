package com.werner.ssm.service;

import com.werner.ssm.domain.entity.User;

import java.util.List;

public interface IUserService {
    /**
     * 查找所有用户
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 登录
     *
     * @param userId
     * @return
     */
    User login(Integer userId);

    /**
     * 注册
     *
     * @param user
     * @return
     */

    User register(User user);



}
