package com.pea.it.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pea.it.provider.api.UserApi;
import com.pea.it.provider.entity.User;
import com.pea.it.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户api实现
 *
 * @author ChenHuiMin@saicmotor.com
 * @date 2017-09-13 10:00
 */
@Service
public class UserApiImpl implements UserApi {

    @Autowired
    private UserService userService;

    public User getById(Long id) {
        return userService.getById(id);
    }

    public List<User> getByName(String firstName, String lastName) {
        return userService.getByName(firstName, lastName);
    }
}
