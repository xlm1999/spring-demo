package com.meng;

import com.meng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) context.getBean("accountServerProxy");
        accountService.transfer("aaa", "bbb", 200d);
    }
}
