package com.pea.it.provider.api;

import com.pea.it.provider.entity.User;

import java.util.List;

public interface UserApi {

    User getById(Long id);

    List<User> getByName(String firstName, String lastName);

}
