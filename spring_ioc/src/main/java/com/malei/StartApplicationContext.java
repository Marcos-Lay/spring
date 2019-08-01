package com.malei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description: 启动ApplicationContext
 * @author: Marcos-Lay
 * @create: 2019-08-01 15:55
 **/
public class StartApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestMassage bean = classPathXmlApplicationContext.getBean(TestMassage.class);
        System.out.println(bean.getMassage());
    }
}
