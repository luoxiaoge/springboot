package com.luoc.controller;

import com.alibaba.fastjson.JSON;
import com.luoc.config.DruidDataSourceConfiguration;
import com.luoc.model.Greeting;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam  String name) {
        //System.out.printf(String.valueOf(name.get("aaa")));
        DruidDataSourceConfiguration druidDataSourceConfiguration = new DruidDataSourceConfiguration();

        System.out.println(druidDataSourceConfiguration.druidDataSource());
        System.out.println("aaaaaaa");
        return new Greeting(1,"HelloWorld");
       /* return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));*/
    }

    @RequestMapping(value = "/greeting2")
    public Greeting greeting2(@RequestBody List<Map<String,Object>> name) {
        System.out.printf(JSON.toJSONString(name));
        return new Greeting(1,"HelloWorld");
       /* return new Greeting(counter.incrementAndGet(),
          String.format(template, name));*/
    }
}
