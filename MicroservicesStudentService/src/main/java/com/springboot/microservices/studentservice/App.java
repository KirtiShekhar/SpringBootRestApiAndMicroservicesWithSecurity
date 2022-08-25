package com.springboot.microservices.studentservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Student Service", version = "2.0", description = "Spring Boot Application consisting of advanced concepts Named StudentService"))
@EnableEurekaClient
@EnableFeignClients("com.springboot.microservices.studentservice.feignClientService")
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        System.out.println( "Running Application Spring Boot Microservices Student Service!" );
    }
}
