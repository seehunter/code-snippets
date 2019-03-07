package com.seehunter.example.firstssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password)throws Exception{
        session.setAttribute("username",username);
        return "redirect:/Goods/queryGoods.action";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession)throws Exception{
        httpSession.invalidate();
        return "redirect:/Goods/queryGoods.action";
    }
}
