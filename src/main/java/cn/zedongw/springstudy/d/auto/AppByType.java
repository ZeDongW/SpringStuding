package cn.zedongw.springstudy.d.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AppByType
 * @Description: Spring自动装配byType
 * @Author ZeDongW
 * @Date 2020/4/13 0013 20:57
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class AppByType {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("d-byType.xml");
        UserAction userAction = (UserAction)ac.getBean("userAction");
        userAction.execute();
    }
}
