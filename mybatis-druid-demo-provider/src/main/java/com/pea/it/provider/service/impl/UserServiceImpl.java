package com.pea.it.provider.service.impl;

import com.pea.it.provider.entity.User;
import com.pea.it.provider.mapper.UserMapper;
import com.pea.it.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService impl
 *
 * @author ChenHuiMin@saicmotor.com
 * @date 2017-09-12 13:40
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getByName(String firstName, String lastName) {
        return userMapper.selectByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public boolean updateUser(User user) {
        int line = userMapper.updateByPrimaryKeySelective(user);
        if (line > 0) {
            return true;
        } else {
            return false;
        }
    }
}
