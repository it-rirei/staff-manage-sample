package com.example.persistence.mapper;

import com.example.persistence.entity.Employee;
import com.example.persistence.entity.Manager;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper

public interface ManagerMapper {
    void save(Manager manager);
    Manager login(@Param("username") String username, @Param("password") String password);
}
