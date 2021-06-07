package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "This is demo - Maven project with (Maven+Jenkins+SonarQube+Docker+AKS+ACR+AppGW)\n";
    }
    
}
