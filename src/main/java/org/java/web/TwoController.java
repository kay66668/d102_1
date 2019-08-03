package org.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @RequestMapping("load")
    public String init(){
        return "hello.....world";
    }
}
