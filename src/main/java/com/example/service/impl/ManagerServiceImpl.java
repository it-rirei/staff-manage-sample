package com.example.service.impl;

import com.example.persistence.entity.Employee;
import com.example.persistence.entity.Manager;
import com.example.persistence.mapper.EmployeeMapper;
import com.example.persistence.mapper.ManagerMapper;
import com.example.service.ManagerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {


    @Override
    public Manager login(String username, String password) {
        return null;
    }

    @Override
    public void register(Manager user) {

    }
}
