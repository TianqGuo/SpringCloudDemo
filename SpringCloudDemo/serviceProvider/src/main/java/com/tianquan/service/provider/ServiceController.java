package com.tianquan.service.provider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServiceController {
        @GetMapping("/sayHello")
        @ResponseBody
        public String sayHello(String name) {
            return "hello there, I am " + name;
        }
}
