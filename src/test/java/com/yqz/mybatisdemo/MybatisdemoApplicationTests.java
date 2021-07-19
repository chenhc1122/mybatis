package com.yqz.mybatisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@SpringBootTest
class MybatisdemoApplicationTests {
    @Autowired
     private DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource);
    }

}
