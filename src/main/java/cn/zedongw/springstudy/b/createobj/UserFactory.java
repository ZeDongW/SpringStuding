package cn.zedongw.springstudy.b.createobj;

import cn.zedongw.springstudy.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName UserFactory
 * @Description: 用户对象创建工厂
 * @Author ZeDongW
 * @Date 2020/4/13 0013 17:44
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserFactory {

    private static Logger logger = LogManager.getLogger(UserFactory.class);

    /**
     * Description: 非静态方法，获取用户实例
     * @methodName: getInstance
     * @param
     * @throws
     * @return: cn.zedongw.springstudy.entity.User
     * @author: ZeDongW
     * @date: 2020/4/13 0013 17:46
     */
    public User getInstance(){
        logger.info("==================工厂：非静态方法，获取用户实例========================");
        return new User(3, "赵六");
    }

    /**
     * Description: 静态方法，获取用户实例
     * @methodName: getStaticInstance
     * @param
     * @throws
     * @return: cn.zedongw.springstudy.entity.User
     * @author: ZeDongW
     * @date: 2020/4/13 0013 17:47
     */
    public static User getStaticInstance(){
        logger.info("====================工厂：静态方法，获取用户实例======================");
        return new User(3, "赵六");
    }


}
