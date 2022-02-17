package com.example.feignclientmicroservicesdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="SimpleClientData",url = "http://localhost:8090")
public interface SimpleClient {
    @GetMapping("/data/{dataId}")
    SimpleClientData getData(@PathVariable int dataId);
//    SimpleClientData addData(SimpleClientData simpleClientData);
}
