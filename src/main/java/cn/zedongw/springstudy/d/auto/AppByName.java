package cn.zedongw.springstudy.d.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AppByName
 * @Description: Spring自动装配byName
 * @Author ZeDongW
 * @Date 2020/4/13 0013 20:52
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class AppByName {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("d-byName.xml");
        UserAction userAction = (UserAction)ac.getBean("userAction");
        userAction.execute();
    }
}
