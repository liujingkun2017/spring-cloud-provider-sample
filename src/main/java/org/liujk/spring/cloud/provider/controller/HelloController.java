package org.liujk.spring.cloud.provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello-world")
    public String index(@RequestParam String name) {


        return " Greetings " + name + " hello world, at " + port;
    }

}
