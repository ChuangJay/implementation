
package com.example._2022_0428_1400_47_code.module_aop.aop;

import com.example._2022_0428_1400_47_code.module_dao.dao.Person;
import com.example._2022_0428_1400_47_code.module_aop.aop.service.PersonService;
import org.aspectj.lang.annotation.Pointcut;


public class PointcutContainer {

    @Pointcut("execution(* com.apress.cems.*.*PersonRepo+.findBy*(..))")
    public void repoFind() {}

    @Pointcut ("execution (* com.apress.cems.aop.service.*Service+.findBy*(..)))")
    public void serviceFind() {}

    @Pointcut("execution (* com.apress.cems.aop.service.*Service+.save(..)) && args(person) && target(service)")
    public void beforeSavePointcut(Person person, PersonService service){}

    @Pointcut("execution(* com.apress.cems.aop.service.*Service+.save*(..))")
    public void proxyBubu(){}
}
