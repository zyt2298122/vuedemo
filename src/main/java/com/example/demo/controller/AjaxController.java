package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zyt on 2018/10/11.
 */
@RestController
public class AjaxController {

    @RequestMapping("/ajax1")
    public Object ajax1(){
        String msg = "请求成功！";
        Map map = new HashMap();
        map.put("msg",msg);
        return map;
    }

}
