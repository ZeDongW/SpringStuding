package cn.zedongw.springstudy.h.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


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
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("h2.xml");
        UserDao3 userDao3 = (UserDao3) ac.getBean("userDao3");
        userDao3.save();
        User user = userDao3.findById(6);
        logger.info(user);
        List<User> list = userDao3.getAll();
        logger.info(list);
    }
}
