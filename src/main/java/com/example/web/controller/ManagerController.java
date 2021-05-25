package com.example.web.controller;

import com.example.persistence.entity.Employee;
import com.example.persistence.entity.Manager;
import com.example.service.EmployeeService;
import com.example.service.ManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/manager")


public class ManagerController {
    @Autowired
    private final ManagerService managerService;

    // EmployeeServiceをDIする（@Autowiredは省略）
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    /**
     * 全件検索を行い、一覧画面に遷移する。


    /**
     * 名前キーワード検索を行い、一覧画面に遷移する。
     */


    /**
     * 入力画面に遷移する。
     */
    @GetMapping("/insertMain")
    public String insertMain() {
        return "manager/insertMain";
    }

    /**
     * 入力を受け取り、DBへの追加を実行する。
     * 追加処理完了後は、一覧画面にリダイレクトする。
     */

    @PostMapping("/login")
    public String login(String username,String password){
        Manager login = managerService.login(username, password);
        if(login!=null){
            return "redirect:/emp/findAll";
        }else{
            return "redirect:/index";
        }
    }


    @PostMapping("/register")
    public String register(Manager manager, String code, HttpSession session){
        String sessionCode = (String)session.getAttribute("code");
        if(sessionCode.equalsIgnoreCase(code)){
            managerService.register(manager);
            return "redirect:/index";
        }else{
            return "redirect:/toRegister";
        }

    }
}
