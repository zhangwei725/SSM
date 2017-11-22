package com.werner.ssm.service.impl;

import com.werner.ssm.domain.entity.User;
import com.werner.ssm.mapper.UserMapper;
import com.werner.ssm.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource()
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User login(Integer userId) {
        return null;
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public User register(User user) {
        userMapper.addUser(user);
        if (user.getUserId() != null) {
            user = userMapper.getUser(user.getUserId());
        }
        return user;
    }

}
