package com.pea.it.provider.web;


import com.dianping.cat.Cat;
import com.dianping.cat.message.Event;
import com.dianping.cat.message.Transaction;
import com.pea.it.provider.entity.User;
import com.pea.it.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
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
            Exception e = new Exception("调用sp出错了");
            log.error("错误测试", e);
            // Cat.getProducer().logError("错误测试");
            return user;
        } catch (Exception e) {
            t.setStatus(e);
            throw new Exception(e);
        } finally {
            t.complete();
        }
    }
}
