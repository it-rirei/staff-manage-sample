package com.example.service.impl;

import com.example.persistence.entity.Employee;
import com.example.persistence.mapper.EmployeeMapper;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.example.web.DataAccessObject.EmployeeDAO;

import java.util.List;
import java.util.UUID;

@Service
@Transactional

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public void save(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        employeeDAO.save(employee);
    }

    @Override
    public void delete(String id) {
        employeeDAO.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee find(String id) {
        return employeeDAO.find(id);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.update(employee);
    }

}
