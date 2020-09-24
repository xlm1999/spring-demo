package com.meng;

import com.meng.dao.CustomerDao;
import com.meng.entity.Customer;
import com.meng.entity.Developer;
import com.meng.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.PriorityQueue;

public class HelloApp {
//    @Autowired
//    private static Customer customer;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao)context.getBean("customerDao");
        Customer customer = new Customer(5, "haohao",29);
        //customerDao.insert(customer);
        Customer byCustomerId = customerDao.findByCustomerId(1);
        System.out.println(customerDao.findAll());
    }

}
