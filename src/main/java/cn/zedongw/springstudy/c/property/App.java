package cn.zedongw.springstudy.c.property;

import cn.zedongw.springstudy.entity.User;
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
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("c.xml");
        User user1 = (User) ac.getBean("user1");
        logger.info(user1);
        User user2 = (User) ac.getBean("user2");
        logger.info(user2);
        User user3 = (User) ac.getBean("user3");
        logger.info(user3);
        UserAction action1 = (UserAction)ac.getBean("action1");
        action1.execute();
        UserAction action2 = (UserAction)ac.getBean("action2");
        action2.execute();
        UserAction action3 = (UserAction)ac.getBean("action3");
        action3.execute();

    }
}
