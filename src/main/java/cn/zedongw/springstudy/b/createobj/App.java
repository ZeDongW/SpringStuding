package cn.zedongw.springstudy.b.createobj;

import cn.zedongw.springstudy.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description: Sping创建对象的方式
 * @Author ZeDongW
 * @Date 2020/4/13 0013 17:11
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class App {

    private static Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("b.xml");
        User user1 = (User) ac.getBean("user1");
        User user2 = (User) ac.getBean("user2");
        User user3 = (User) ac.getBean("user3");
        User user4 = (User) ac.getBean("user4");
        User user5 = (User) ac.getBean("user5");
        logger.info("=================user1:{}===============",user1);
        logger.info("=================user2:{}===============",user2);
        logger.info("=================user3:{}===============",user3);
        logger.info("=================user4:{}===============",user4);
        logger.info("=================user5:{}===============",user5);
    }
}
