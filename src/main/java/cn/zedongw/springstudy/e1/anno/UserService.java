package cn.zedongw.springstudy.e1.anno;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Description: 模拟用户业务层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:50
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
@Component
public class UserService {
    private UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        this.userDao.save();
    }
}
