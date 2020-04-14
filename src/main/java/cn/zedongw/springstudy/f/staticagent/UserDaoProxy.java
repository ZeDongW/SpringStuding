package cn.zedongw.springstudy.f.staticagent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName UserDaoProxy
 * @Description: UserDaoImpl静态代理类
 * @Author ZeDongW
 * @Date 2020/4/14 0014 10:51
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDaoProxy implements IUserDao{

    private static Logger logger = LogManager.getLogger(UserDaoProxy.class);

    /**
     * 目标对象
     */
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

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
        logger.info("=========开启事务=========");
        target.save();
        logger.info("=========提交事务=========");
    }
}
