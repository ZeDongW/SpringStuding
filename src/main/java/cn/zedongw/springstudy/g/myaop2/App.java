package cn.zedongw.springstudy.g.myaop2;

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
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("g2.xml");
        IUserDao proxy = (IUserDao) ac.getBean("proxy");
        proxy.save();
    }
}
