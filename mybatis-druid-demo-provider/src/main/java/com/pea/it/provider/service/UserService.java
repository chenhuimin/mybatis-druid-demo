package com.pea.it.provider.service;

import com.pea.it.provider.entity.User;

import java.util.List;

public interface UserService {
    User getById(Long id);

    List<User> getByName(String firstName, String lastName);

    boolean updateUser(User user);
}
