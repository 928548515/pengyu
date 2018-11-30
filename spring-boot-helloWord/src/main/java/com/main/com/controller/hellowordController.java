package com.main.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellowordController {

       @ResponseBody
       @RequestMapping("/hello")
       public String helloWord(){
           return  "Hello Word!!!";
       }
}
