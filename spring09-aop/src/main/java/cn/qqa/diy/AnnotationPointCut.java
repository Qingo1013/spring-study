package cn.qqa.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解方式实现AOP
//标注该类是一个切面
@Aspect
public class AnnotationPointCut {

    @Before("execution(* cn.qqa.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }

    @After("execution(* cn.qqa.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后======");
    }

    //z在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* cn.qqa.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");

        //获得签名
        System.out.println(pjp.getSignature());


        //执行方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后");

    }

}
