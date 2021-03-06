package org.yangdongdong.springcloud.service.api;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(String name) {
        System.out.println("client 1");
        return "hello " + name;
    }

    @RequestMapping(value = "/retry", method = RequestMethod.GET)
    public String retry() {
        System.err.println("client 1 call.......");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "client 1";
    }

}
