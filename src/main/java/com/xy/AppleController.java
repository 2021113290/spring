package com.xy;

import org.springframework.stereotype.Controller;
//注解方式获取对象
@Controller //将对象存储到spring中
public class AppleController {
    public String apple(){
        return "I'm apple";
    }
}
