package com.meng.service.impl;

import com.meng.dao.AccountDao;
import com.meng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    //注入DAO类
    @Autowired
    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void transfer(final String out, final String in, final Double money) {
        accountDao.outMoney(out, money);
        int i = 1/1;
        accountDao.inMoney(in, money);
//        transactionTemplate.execute(
//                new TransactionCallbackWithoutResult() {
//                    @Override
//                    protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                        accountDao.outMoney(out,money);
//                        int i = 1/0;
//                        accountDao.inMoney(in,money);
//                    }
//                }
//        );
    }
}
