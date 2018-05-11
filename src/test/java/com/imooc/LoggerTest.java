package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Administrator
 * @date: 2018/4/25/025
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
//    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name ="imooc";
        String password ="123456";
        log.debug("debug...");
        log.info("infotest...");
        log.error("error...");
        log.info("name:{},password:{}",name,password);

    }
}
