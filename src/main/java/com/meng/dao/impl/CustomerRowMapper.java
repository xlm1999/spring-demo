package com.meng.dao.impl;

import com.meng.entity.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerRowMapper implements RowMapper {
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustId(resultSet.getInt("CUST_ID"));
        customer.setName(resultSet.getString("NAME"));
        customer.setAge(resultSet.getInt("AGE"));
        return customer;
    }







}
