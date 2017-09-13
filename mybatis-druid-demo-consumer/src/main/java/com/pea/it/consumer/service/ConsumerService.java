package com.pea.it.consumer.service;

import com.pea.it.provider.entity.User;

public interface ConsumerService {
    User getUserById(Long id);
}
