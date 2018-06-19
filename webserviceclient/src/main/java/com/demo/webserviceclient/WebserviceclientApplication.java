package com.demo.webserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo","mypackage"})
public class WebserviceclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceclientApplication.class, args);
    }
}
