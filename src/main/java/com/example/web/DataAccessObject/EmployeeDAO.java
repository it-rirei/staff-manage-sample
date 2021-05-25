package com.example.web.DataAccessObject;

import com.example.persistence.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();


    void update(Employee employee);

    Employee find(String id);

    void save(Employee employee);

    void delete(String id);
}
