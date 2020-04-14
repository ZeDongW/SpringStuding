package cn.zedongw.springstudy.a.hello.app;

import cn.zedongw.springstudy.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description: Spring第一个Demo
 * @Author ZeDongW
 * @Date 2020/4/13 0013 16:11
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("a.xml");
        System.out.println("-----容器创建-----");
        User user1 = (User)ac.getBean("user");
        User user2 = (User)ac.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        ac.close();
    }
}
