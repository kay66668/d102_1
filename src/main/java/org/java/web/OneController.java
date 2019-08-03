package org.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {
    @RequestMapping("init")
    public String init(){
        return "hello.....";
    }
}
