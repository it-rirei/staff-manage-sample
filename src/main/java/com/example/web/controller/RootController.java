package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {



    @GetMapping("/index")
    public String toIndex(){
        return "employee/login";
    }

    @GetMapping("toRegister")
    public String toRegister(){
        return "employee/register";
    }

    @GetMapping("/toSave")
    public String toSave(){
        return "employee/addEmp";
    }

    @GetMapping("/toUpdate")
    public String toUpdate(){
        return "employee/updateEmp";
    }

}
