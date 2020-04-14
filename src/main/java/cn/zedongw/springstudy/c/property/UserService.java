package cn.zedongw.springstudy.c.property;

/**
 * @ClassName UserService
 * @Description: 模拟用户业务层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:50
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        this.userDao.save();
    }
}
