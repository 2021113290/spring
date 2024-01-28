package com.xy.component;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanLifeComponent implements BeanNameAware {
    @PostConstruct
    public void postConstruct() {
        System.out.println("执⾏ PostConstruct()");
    }
    public void init() {
        System.out.println("执⾏ BeanLifeComponent init-method");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("执⾏：preDestroy()");
    }
    public void setBeanName(String s) {
        System.out.println("各种通知：执⾏了 setBeanName ⽅法：" + s);
    }
}