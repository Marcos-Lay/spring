package com.malei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: spring
 * @description: 测试FileSystemXmlApplicationContext
 * @author: Marcos-Lay
 * @create: 2019-08-01 15:27
 **/
@RunWith(SpringJUnit4ClassRunner.class)
public class TestFileSystemXmlApplicationContext {
    //使用了classpath作为前缀，这样FileSystemXmlApplicationContext就可以读到classpath的配置文件
    @Test
    public void test1(){
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("classpath：applicationContext.xml");
    }
    //加载多个配置文件,多个配置文件以逗号隔开
    @Test
    public void test2(){
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("classPath:application.xml","classPath:application1.xml");
    }
    //以String数组形式加载多个配置文件，并指定refresh
    @Test
    public void test3(){
        String[] a = {"",""};
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(a,false);
    }
}
