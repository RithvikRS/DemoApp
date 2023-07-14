package com.docker.demo;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class AppController {
    @RequestMapping(value = "/")
    public String demoHome(){
        return "This is a trial website by Rithvik";
    }
}
