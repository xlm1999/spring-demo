package com.meng.dao;

import com.meng.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
    public List findAll();
    int insertBatch(List list);
}
