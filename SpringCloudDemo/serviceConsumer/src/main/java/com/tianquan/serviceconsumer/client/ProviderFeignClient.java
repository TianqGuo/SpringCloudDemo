package com.tianquan.serviceconsumer.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "serviceProvider")
public interface ProviderFeignClient {
    /**
     * 定义服务接口
     * 参数：需要与provider对应
     * 方法名：不需要对应
     * 返回值：需要与provider对应
     * URL:需要一致
     */
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name")String name);
}
