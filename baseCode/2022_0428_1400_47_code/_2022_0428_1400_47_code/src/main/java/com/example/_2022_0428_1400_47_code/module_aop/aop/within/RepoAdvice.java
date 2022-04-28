package com.example._2022_0428_1400_47_code.module_aop.aop.within;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class RepoAdvice {
    private static final Logger logger = LoggerFactory.getLogger(RepoAdvice.class);

    @Before("com.apress.cems.aop.within.PointcutContainer.onAnyRepoMethod()")
    public void beforeAnyMethodInRepo(JoinPoint joinPoint) {
        var methodName = joinPoint.getSignature().getName();
        var className = joinPoint.getSignature().getDeclaringTypeName();
        logger.info("[Before(within Repo)] ---> calling: {}.{}", className, methodName);
    }

    @Before("com.apress.cems.aop.within.PointcutContainer.onAnyServiceMethod()")
    public void beforeAnyMethodInService(JoinPoint joinPoint) {
        var methodName = joinPoint.getSignature().getName();
        var className = joinPoint.getSignature().getDeclaringTypeName();
        logger.info("[[Before(within Service)] ---> calling: {}.{}", className, methodName);
    }

}
