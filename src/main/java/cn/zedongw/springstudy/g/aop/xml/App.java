package cn.zedongw.springstudy.g.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description: 手动实现AOP
 * @Author ZeDongW
 * @Date 2020/4/14 0014 10:56
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("g4.xml");
        IUserDao daoImpl = (IUserDao) ac.getBean("userDaoImpl");
        daoImpl.save();
    }
}
