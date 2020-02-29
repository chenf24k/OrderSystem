package com.imooc.sell;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
    }

    @Test
    public void test2() {
        String name = "imooc";
        String password = "123456";
        log.info("name:{},password:{}", name, password);
        log.error("error...");
    }
}
