package cn.zedongw.springstudy.f.cglibagent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName MyProxyFactory
 * @Description: Cglib动态代理
 * @Author ZeDongW
 * @Date 2020/4/14 0014 15:13
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class MyProxyFactory implements MethodInterceptor {

    private static Logger logger = LogManager.getLogger(MyProxyFactory.class);

    private Object target;

    public MyProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(this.target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("=========开启事务=========");
        Object result = method.invoke(target, objects);
        logger.info("=========提交事务=========");
        return result;
    }
}
