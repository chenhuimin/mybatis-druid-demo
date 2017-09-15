package com.pea.it.consumer.web;


import com.pea.it.consumer.service.ConsumerService;
import com.pea.it.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/api/consume/{id}")
    public User getById(@PathVariable Long id) {
        return consumerService.getUserById(id);
    }
}
