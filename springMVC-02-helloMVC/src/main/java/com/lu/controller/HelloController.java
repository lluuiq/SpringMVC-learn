package com.lu.controller;

import org.springframework.web.servlet.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();

        // 封装对象，放在ModelAndView中。 model
        mv.addObject("msg", "HelloSpringMVC!");
        // 封装要跳转的识图，放在ModelAndView中
        mv.setViewName("hello"); // : /WB-INF/jsp/Hello.jsp
        return mv;
    }
}
