package cn.zedongw.springstudy.g.myaop2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;
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
    @Resource
    private static Object target;

    @Resource
    private static Aop aop;


    public static Object getProxyInstance(Object target1, Aop aop1){
        target=target1;
        aop=aop1;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aop.begin();
                        Object result = method.invoke(target, args);
                        aop.end();
                        return result;
                    }
                });
    }
}
