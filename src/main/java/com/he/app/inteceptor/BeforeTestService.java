package com.he.app.inteceptor;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by heshaoyi on 10/11/16.
 */
@Component
public class BeforeTestService implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.err.println("get method " + method);
    }
}
