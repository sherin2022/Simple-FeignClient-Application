package com.example.feignclientmicroservicesdemo;

import lombok.Value;


// https://stackabuse.com/the-value-annotation-in-spring/
//Refer this for more use of @Value annotation.
@Value
public class SimpleClientData {

    private int id;
    private String name;
    private int amount;
}
