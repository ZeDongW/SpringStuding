package cn.zedongw.springstudy.f.dynamicagent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyProxyFactory
 * @Description: UserDaoImpl Cglib代理
 * @Author ZeDongW
 * @Date 2020/4/14 0014 10:51
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class MyProxyFactory {

    private static Logger logger = LogManager.getLogger(MyProxyFactory.class);

    /**
     * 目标对象
     */
    private Object target;

    public MyProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        logger.info("=========开启事务=========");
                        Object result = method.invoke(target, args);
                        logger.info("=========提交事务=========");
                        return result;
                    }
                });
    }
}
