package com.dush.springcloud_learning.microservice_consumer_movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jobba on 2018/4/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMovieApplication {
    @Bean
    public RestTemplate  restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(ConsumerMovieApplication.class,args);
    }
}
