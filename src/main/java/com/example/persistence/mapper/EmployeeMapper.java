package com.example.persistence.mapper;

import com.example.persistence.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// インタフェースのみ作成する（実装クラスは実行時に作成される）
@Mapper
public interface EmployeeMapper {
    public List<Employee> findAll();



    void save(Employee employee);

    void delete(String id);

    Employee find(String id);

    void update(Employee employee);
}
