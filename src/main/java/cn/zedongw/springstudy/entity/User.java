package cn.zedongw.springstudy.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName User
 * @Description: 用户实体类
 * @Author ZeDongW
 * @Date 2020/4/13 0013 16:10
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class User {

    private static Logger logger = LogManager.getLogger(User.class.getName());

    /**
     * id
     */
    private int id;

    /**
     * 用户名
     */
    private String userName;

    public User() {
        super();
        logger.info("====================调用无参构造方法==================");
    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
        logger.info("====================调用带参构造方法==================");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void initUser() {
        logger.info("###############创建对象之后，初始化#########################");
    }

    public void destroyUser() {
        logger.info("###############IOC容器销毁，user对象回收!#########################");
    }
}
