package com.seehunter.example.firstssm.controller;

import com.seehunter.example.firstssm.bean.GoodsExtends;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTest {

    @RequestMapping("/requestJson")
    public @ResponseBody GoodsExtends requestJson(@RequestBody GoodsExtends goodsExtends){
        return goodsExtends;
    }

    @RequestMapping("/responseJson")
    public @ResponseBody GoodsExtends responseJson(GoodsExtends goodsExtends){
        return goodsExtends;
    }
}