package com.nt.erp.webController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class WebLogin {
    
    @RequestMapping(value = "/iniLogin", method = RequestMethod.GET)
    public ModelAndView iniLogin() { //ModelAndView
        ModelAndView mav = new ModelAndView();
        //LOG.info("欢迎登陆支撑平台");
        System.out.println("-----------------");
        mav.setViewName("login");
        return mav;
        //return "login";
    }
    
    @RequestMapping(value = "/iniIndex", method = RequestMethod.GET)
    public ModelAndView iniIndex() {
        ModelAndView mav = new ModelAndView();
       // LOG.info("跳转：");
        mav.setViewName("index");
        return mav;
    }
    
}


