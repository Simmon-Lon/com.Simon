package com.southwind.springboottest.controller;

import com.southwind.springboottest.entity.Baseinfo;
import com.southwind.springboottest.repsositroy.BaseinfoRepsositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;


@RestController
@RequestMapping("/Baseinfo")
public class qqmasterHandler {
    @Autowired
    private BaseinfoRepsositroy baseinfoRepsositroy;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Baseinfo> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request=PageRequest.of(page,size);
        return baseinfoRepsositroy.findAll(request);
    }
    @PostMapping("/save")
    public String save(@RequestBody Baseinfo baseinfo){//将前端请求转换为json格式
        Baseinfo result=baseinfoRepsositroy.save(baseinfo);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @GetMapping("findById/{qqid}")
    public Baseinfo findById(@PathVariable("qqid")BigInteger qqid){
        return baseinfoRepsositroy.findById(qqid).get();
    }
    @PutMapping("/update")
    public String update(@RequestBody Baseinfo baseinfo){
        Baseinfo result=baseinfoRepsositroy.save(baseinfo);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @DeleteMapping("/deleteById/{qqid}")
    public void deleteById(@PathVariable("qqid") BigInteger qqid){
        baseinfoRepsositroy.deleteById(qqid);
    }
}
