package com.pea.it.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pea.it.consumer.service.ConsumerService;
import com.pea.it.provider.api.UserApi;
import com.pea.it.provider.entity.User;
import org.springframework.stereotype.Service;

/**
 * ConsumerService
 *
 * @author ChenHuiMin@saicmotor.com
 * @date 2017-09-13 19:43
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Reference
    private UserApi userApi;

    @Override
    public User getUserById(Long id) {
        return userApi.getById(id);
    }
}
