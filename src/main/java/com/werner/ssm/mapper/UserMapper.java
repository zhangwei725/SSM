package com.werner.ssm.mapper;

import com.werner.ssm.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户
 * @author zhangwei
 */
@Repository
public interface UserMapper {

    void updateUser(User user);

    void deleteUser(Integer integer);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    User addUser(User user);

    User getUser(Integer id);

    User getAllUsers();
}
