package com.example.feignclientmicroservicesdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AppController {

    @Autowired
    private final SimpleClient client;

    @GetMapping("/data/{id}")
    public SimpleClientData getData(@PathVariable int id){
        return client.getData(id);
    }

//       @PostMapping("/addData")
//       public SimpleClientData postData(@RequestBody SimpleClientData simpleclientdata){
//         return client.addData();
   // }

}
