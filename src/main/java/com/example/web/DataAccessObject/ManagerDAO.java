package com.example.web.DataAccessObject;

import com.example.persistence.entity.Manager;
import org.apache.ibatis.annotations.Param;

public interface ManagerDAO {
    void save(Manager manager);
    Manager login(@Param("username") String username, @Param("password") String password);

}
