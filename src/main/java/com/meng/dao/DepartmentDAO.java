package com.meng.dao;

import com.meng.entity.Customer;
import com.meng.entity.Department;

import java.util.ArrayList;
import java.util.List;

public interface DepartmentDAO {
    public List<Department> queryDepartment() throws Exception ;
}
