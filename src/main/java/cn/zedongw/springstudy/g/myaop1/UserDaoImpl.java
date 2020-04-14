package cn.zedongw.springstudy.g.myaop1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName UserDaoImpl
 * @Description: 模拟持久层接口实现类
 * @Author ZeDongW
 * @Date 2020/4/14 0014 10:42
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDaoImpl implements IUserDao {

    private static Logger logger = LogManager.getLogger(UserDaoImpl.class);

    private Aop aop = new Aop();

    /**
     * Description: 保存数据
     *
     * @throws
     * @methodName: save
     * @return: void
     * @author: ZeDongW
     * @date: 2020/4/14 0014 10:41
     */
    @Override
    public void save() {
        aop.begin();
        logger.info("========执行更新==========");
        aop.end();
    }
}
