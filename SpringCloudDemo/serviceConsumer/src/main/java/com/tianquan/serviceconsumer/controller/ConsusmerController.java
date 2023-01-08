package com.tianquan.serviceconsumer.controller;


import com.tianquan.serviceconsumer.client.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsusmerController {

    @Autowired
    ProviderFeignClient providerFeignClient;

    @GetMapping("/call/sayHello")
    @ResponseBody
    public String consumer(String name) {
        String response = providerFeignClient.sayHello(name);
        return "Consumer Result: " + response;
    }
}
