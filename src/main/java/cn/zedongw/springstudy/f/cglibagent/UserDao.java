package cn.zedongw.springstudy.f.cglibagent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName UserDao
 * @Description: 模拟数据发访问层
 * @Author ZeDongW
 * @Date 2020/4/14 0014 15:10
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDao {

    private static Logger logger = LogManager.getLogger(UserDao.class);

    public void save(){
        logger.info("========执行更新==========");
    }
}
