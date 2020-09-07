package cn.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello SpringMvc");
        return "success";
    }
}
