import com.xy.AppleController;
import com.xy.controller.StudentController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.beans.Introspector;

public class App {
    public static void main(String[] args) {
// 1.得到 Spring 的上下⽂对象，创建的时候需要配置 Spring 配置信息:两种方式获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        BeanFactory context=new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//        // 2.加载某个 bean
//        User user = (User) context.getBean("user");//根据bean名称(标识)获取bean
//        User user1=context.getBean(User.class);//根据bean类型获取bean
//        User user2=context.getBean("user",User.class);//根据Bean名称+bean类型获取bean
//
//        System.out.println(user.sayHi("lucy"));
//        AppleController appleController=context.getBean("appleController", AppleController.class);
//        System.out.println(appleController.apple());
//
//        String s1="Apple";
//        System.out.println("s1:"+ Introspector.decapitalize(s1));
//
//        String s2="apple";
//        System.out.println("s2:"+ Introspector.decapitalize(s2));
//
//        String s3="APple";
//        System.out.println("s3:"+ Introspector.decapitalize(s3));

//        User user1=context.getBean("user",User.class);
//        System.out.println(user1.sayHi("yu"));
        StudentController sc=context.getBean("studentController",StudentController.class);
        sc.sayhi();
    }

}
