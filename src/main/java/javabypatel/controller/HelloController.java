package javabypatel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello()
    {
        return "Hello JavaByPatel on Openshift!!";
    }

    @RequestMapping("/greet")
    public String greet(String name) {
        return "Hello "+name;
    }
}
