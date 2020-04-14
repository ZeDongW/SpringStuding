package cn.zedongw.springstudy.g.aop.anno;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @ClassName Aop
 * @Description: 注解实现AOP
 * @Author ZeDongW
 * @Date 2020/4/14 0014 16:23
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
@Aspect
@Component
public class Aop {

    private static Logger logger = LogManager.getLogger(Aop.class);

    @Pointcut("execution(* cn.zedongw.springstudy.g.aop.anno.UserDaoImpl.save(..) )")
    public void pointCut(){}

    @Before("pointCut()")
    public void begin(){
        logger.info("=========前置通知 : 在执行目标方法之前执行=========");
    }

    @After("pointCut()")
    public void end(){
        logger.info("=========后置/最终通知：在执行目标方法之后执行  【无论是否出现异常最终都会执行】=========");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        logger.info("=========返回后通知： 在调用目标方法结束后执行 【出现异常不执行】=========");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        logger.info("=========异常通知： 当目标方法执行异常时候执行此关注点代码=========");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        logger.info("=========环绕通知：环绕目标方式执行，环绕前=========");
        pjp.proceed();  // 执行目标方法
        logger.info("=========环绕通知：环绕目标方式执行，环绕后=========");
    }

}
