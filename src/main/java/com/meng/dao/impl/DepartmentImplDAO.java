package com.meng.dao.impl;

import com.meng.dao.DepartmentDAO;
import com.meng.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component(value = "deparmentDao2")
public class DepartmentImplDAO implements DepartmentDAO {
    @Autowired
    private DataSource dataSource;


    public List<Department> queryDepartment() throws Exception {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select d.dept_id, d.dept_no, d.dept_name from DEPARTMENT d");
        List list = new ArrayList();
        while (rs.next()){
            Long deptId = rs.getLong("dept_id");
            String deptNo = rs.getString("dept_no");
            String deptName = rs.getString("dept_name");
            Department dept = new Department(deptId, deptNo, deptName);
            list.add(dept);
        }

        return list;
    }
}
