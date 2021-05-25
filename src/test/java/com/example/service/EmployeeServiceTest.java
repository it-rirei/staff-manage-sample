package com.example.service;

import com.example.Application;
import com.example.persistence.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

public class EmployeeServiceTest {

    public static void main(String[] args) {
        // DIコンテナの作成
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // EmployeeServiceのBeanを取得
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // 新規追加のテスト
        System.out.println("==== 新規追加 ====");
        employeeService.insert(new Employee("和田三郎", LocalDate.of(2019, 1, 1), 10));

        // 全件検索のテスト
        System.out.println("==== 全件検索 ====");
        List<Employee> employeeList1 = employeeService.findAll();
        for (Employee employee : employeeList1) {
            System.out.println(employee);
        }

        // 名前キーワード検索のテスト
        System.out.println("==== 名前キーワード検索 ====");
        List<Employee> employeeList2 = employeeService.findByNameLike("田");
        for (Employee employee : employeeList2) {
            System.out.println(employee);
        }
    }

}
