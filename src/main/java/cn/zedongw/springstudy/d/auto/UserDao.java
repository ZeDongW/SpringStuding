package cn.zedongw.springstudy.d.auto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName UserDao
 * @Description: 模拟用户持久层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:48
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDao {
    private static Logger logger = LogManager.getLogger(UserDao.class);
    public void save() {
        logger.info("===========DB:保存用户===========");
    }
}
