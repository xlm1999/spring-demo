package com.meng.dao;

import com.meng.entity.Customer;

public interface CustomerDao {
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
