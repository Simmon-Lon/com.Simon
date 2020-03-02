package com.southwind.springboottest;

import com.southwind.springboottest.entity.Baseinfo;
import com.southwind.springboottest.repsositroy.BaseinfoRepsositroy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigInteger;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private BaseinfoRepsositroy repsositroy;

    @Test
    void contextLoads() {
        PageRequest pageRequest=PageRequest.of(0,3);
        Page<Baseinfo> page=repsositroy.findAll(pageRequest);
    }
    @Test
    void save(){
        Baseinfo baseinfo=new Baseinfo();
        BigInteger element=new BigInteger("220201");
        baseinfo.setQQID(element);
        baseinfo.setNickName("傻逼");
        baseinfo.setSex(1);
        Baseinfo out=repsositroy.save(baseinfo);
        System.out.println(out);
    }
    @Test
    void findById(){
        BigInteger element=new BigInteger("286207");
        Baseinfo baseinfo=repsositroy.findById(element).get();
        System.out.println(baseinfo);
    }
    @Test
    void update(){
        Baseinfo baseinfo=new Baseinfo();
        BigInteger element=new BigInteger("220201");
        baseinfo.setQQID(element);
        baseinfo.setNickName("傻逼傻逼");
        baseinfo.setSex(1);
        Baseinfo baseinfo1=repsositroy.save(baseinfo);
        System.out.println(baseinfo1);
    }
    @Test
    void delete(){
        BigInteger element=new BigInteger("286207");
        repsositroy.deleteById(element);
    }

}
