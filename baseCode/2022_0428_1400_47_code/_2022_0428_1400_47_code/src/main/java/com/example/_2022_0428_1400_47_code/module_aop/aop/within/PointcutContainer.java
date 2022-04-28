
package com.example._2022_0428_1400_47_code.module_aop.aop.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PointcutContainer {

    // all methods in classes in package com.apress.cems.repos
    // @Pointcut("within(com.apress.cems.repos..*)")

    // all methods in classes implementing PersonRepo
    @Pointcut("within(com.apress.cems.repos.PersonRepo+)")
    public void onAnyRepoMethod() {
    }

    @Pointcut("within( com.apress.cems.aop.service.*)")
    public void onAnyServiceMethod() {
    }

}
