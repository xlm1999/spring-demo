package com.meng.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBeforeMethod implements MethodInterceptor {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before advice 前置通知");
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            // proceed to original method call
            Object result = methodInvocation.proceed();

            // same with AfterReturningAdvice
            System.out.println("HijackAroundMethod : Before after hijacked!");

            return result;

        } catch (IllegalArgumentException e) {
            // same with ThrowsAdvice
            System.out.println("HijackAroundMethod : Throw exception hijacked!");
            throw e;
        }


    }
}
