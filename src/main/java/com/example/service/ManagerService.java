package com.example.service;

import com.example.persistence.entity.Employee;
import com.example.persistence.entity.Manager;

import java.util.List;

public interface ManagerService {


    Manager login(String username, String password);

    void register(Manager manager);
}
