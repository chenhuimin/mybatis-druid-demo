package com.pea.it.provider.web;


import com.dianping.cat.Cat;
import com.dianping.cat.message.Event;
import com.dianping.cat.message.Transaction;
import com.pea.it.provider.entity.User;
import com.pea.it.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestCatController {
    @Autowired
    private UserService userService;

    @RequestMapping("/api/testCat/user/{id}")
    public User getById(@PathVariable Long id) throws Exception {
        String pageName = "getUserById";
        String serverIp = "192.168.10.100";
        double amount = 9.99;
        Transaction t = Cat.newTransaction("URL", pageName);
        try {
            Cat.logEvent("URL.Server", serverIp, Event.SUCCESS, "ip=" + serverIp + "&...");
            Cat.logMetricForCount("PayCount", 1);
            Cat.logMetricForSum("PayAmount", amount);
            User user = userService.getById(id);
            t.setStatus(Transaction.SUCCESS);
            return user;
        } catch (Exception e) {
            t.setStatus(e);
            throw new Exception(e);
        } finally {
            t.complete();
        }
    }
}
