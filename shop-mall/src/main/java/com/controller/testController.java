package com.controller;



import com.POJO.people;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: testController
 * @Description:
 * @Date: 2021/4/8 9:44
 * @Author: zt
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")

public class testController {

    @RequestMapping("/having")
    public people getOne(String id){
        people peo = new people();
        peo.setName("zt");
        peo.setAge(24);
        peo.setSex('男');
        return peo;
    }
    @RequestMapping("/nothing")
    public HashMap getOne(people ple){
        HashMap hashMap = new HashMap<>();
        System.out.println(ple.getName());
         hashMap.put("people",ple);
        return hashMap;
    }


}
