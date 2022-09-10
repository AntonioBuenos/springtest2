package by.smirnov.springtest.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class HelloController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(this.hello);
        return "hello";
    }
}
