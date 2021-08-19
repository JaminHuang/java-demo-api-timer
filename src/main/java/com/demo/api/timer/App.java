package com.demo.api.timer;

import com.demo.sdk.apollo.EnableMyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients
@EnableEurekaClient
@EnableTransactionManagement
@SpringBootApplication
@EnableMyConfig
@ComponentScan(basePackages = {"com.demo"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
