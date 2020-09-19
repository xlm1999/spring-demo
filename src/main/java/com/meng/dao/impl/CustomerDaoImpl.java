package com.meng.dao.impl;

import com.meng.dao.CustomerDao;
import com.meng.entity.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void insert(Customer customer) {
        String sql = "INSERT INTO customer(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
        jdbcTemplate = new JdbcTemplate(dataSource);
getJdbcTemplate().update("");




    }

    public Customer findByCustomerId(int custId) {
        return null;
    }

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
