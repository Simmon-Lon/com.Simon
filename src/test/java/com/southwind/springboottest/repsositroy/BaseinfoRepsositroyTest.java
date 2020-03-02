package com.southwind.springboottest.repsositroy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseinfoRepsositroyTest {
    @Autowired
    private BaseinfoRepsositroy baseinfoRepsositroy;
    @Test
    void findAll(){
        System.out.println(baseinfoRepsositroy.findAll());
    }
}