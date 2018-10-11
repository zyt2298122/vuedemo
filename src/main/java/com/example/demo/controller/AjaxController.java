package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/ajax2")
    public Object ajax2(HttpServletRequest request){
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String msg = "请求成功！传入参数为：a:"+a+" b:"+b;
        Map map = new HashMap();
        map.put("msg",msg);
        return map;
    }

}
