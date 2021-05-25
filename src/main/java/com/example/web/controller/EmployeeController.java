package com.example.web.controller;

import com.example.persistence.entity.Employee;
import com.example.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired

    // EmployeeServiceをDIする（@Autowiredは省略）
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 全件検索を行い、一覧画面に遷移する。
     */
    @GetMapping("/index")
    public String index(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "employee/index";
    }

    /**
     * 名前キーワード検索を行い、一覧画面に遷移する。
     */


    /**
     * 入力画面に遷移する。
     */
    @GetMapping("/insertMain")
    public String insertMain() {
        return "employee/insertMain";
    }

    /**
     * 入力を受け取り、DBへの追加を実行する。
     * 追加処理完了後は、一覧画面にリダイレクトする。
     */


    @PostMapping("/update")
    public String update(Employee employee){
        employeeService.update(employee);
        return "redirect:/emp/findAll";
    }


    @GetMapping("/find")
    public String find(String id,Model model){
        Employee employee = employeeService.find(id);
        model.addAttribute("employee",employee);
        return "/ems/updateEmp";
    }


    @PostMapping("/save")
    public String save(Employee employee){
        employeeService.save(employee);
        return "redirect:/emp/findAll";
    }

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Employee> employee = employeeService.findAll();
        model.addAttribute("employee",employee);
        return "/employee/employeelist";
    }

    @GetMapping("/delete")
    public String delete(String id){
        employeeService.delete(id);
        return "redirect:/emp/findAll";
    }
}
