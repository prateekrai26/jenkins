package com.example.aws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class AwsApplication {

   public static Logger logger = LoggerFactory.getLogger(AwsApplication.class);

   @PostConstruct
    public void home(){
        logger.info("In Home");
    }
    public static void main(String[] args) {
        logger.info("Application Executed");
        SpringApplication.run(AwsApplication.class, args);
    }

}
