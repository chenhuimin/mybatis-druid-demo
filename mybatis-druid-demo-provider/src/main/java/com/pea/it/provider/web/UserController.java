package com.pea.it.provider.web;


import com.pea.it.provider.entity.User;
import com.pea.it.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/api/user/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @RequestMapping("/api//user/name")
    public List<User> getByName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String
            lastName) {
        return userService.getByName(firstName, lastName);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean update(@RequestBody User user) {
        User selectedUser = userService.getById(user.getId());
        selectedUser.setFirstName(user.getFirstName());
        return userService.updateUser(selectedUser);
    }

}
