package cn.zedongw.springstudy.e2.anno;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ClassName App
 * @Description: Spring注入属性
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:53
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class App {

    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("e2.xml");
        UserAction userAction = (UserAction)ac.getBean("userAction");
        userAction.execute();
    }
}
