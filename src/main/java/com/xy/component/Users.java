package com.xy.component;

import com.xy.model.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Users {
    //设置作用域
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//描述：每次对该作⽤域下的Bean的请求都会创建新的实例：获取Bean（即通过applicationContext.getBean等⽅法获取）及装配Bean（即通过@Autowired注⼊）都是新的对象实例
    @Bean
    public User user1() {
        User user = new User();
        user.setId(1);
        user.setName("Java");
        return user;
    }
    @Bean
    public User user2() {
        User user = new User();
        user.setId(2);
        user.setName("MySQL");
        return user;
    }
}
