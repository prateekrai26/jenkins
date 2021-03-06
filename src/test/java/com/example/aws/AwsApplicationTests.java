package com.example.aws;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AwsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(AwsApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("In Test Case");
    }

}
