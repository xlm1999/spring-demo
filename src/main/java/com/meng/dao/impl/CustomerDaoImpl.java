package com.meng.dao.impl;

import com.meng.dao.CustomerDao;
import com.meng.entity.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public void insert(Customer customer) {

        String sql = "INSERT INTO customer " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql, new Object[]{customer.getCustId(),
                customer.getName(), customer.getAge()
        });

    }

    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Customer customer = (Customer) getJdbcTemplate().queryForObject(
                sql, new Object[]{"1"}, new BeanPropertyRowMapper(Customer.class));
        return customer;
    }

    public List findAll() {
        List list = getJdbcTemplate().query("SELECT * FROM CUSTOMER", new BeanPropertyRowMapper(Customer.class));
        return list;
    }

    public int insertBatch(List list) {
        return 0;
    }

}
