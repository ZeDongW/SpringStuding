package cn.zedongw.springstudy.g.myaop1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @ClassName Aop
 * @Description: 手动实现Aop
 * @Author ZeDongW
 * @Date 2020/4/14 0014 16:23
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Aop {

    private static Logger logger = LogManager.getLogger(Aop.class);

    public void begin(){
        logger.info("=========开启事务=========");
    }

    public void end(){
        logger.info("=========提交事务=========");
    }
}
