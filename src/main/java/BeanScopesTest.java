import com.xy.controller.BeanScopesController;
import com.xy.controller.BeanScopesController2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        BeanScopesController beanScopesController = context.getBean(BeanScopesController.class);
        System.out.println("A 对象修改之后 Name：" + beanScopesController.getUser1().toString());
        BeanScopesController2 beanScopesController2 = context.getBean(BeanScopesController2.class);
        System.out.println("B 对象读取到的 Name：" + beanScopesController2.getUser1().toString());
    }
}
