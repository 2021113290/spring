
import com.xy.component.BeanLifeComponent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanLifeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        BeanLifeComponent life = context.getBean(BeanLifeComponent.class);
        System.out.println("使用bean");
// 执⾏销毁⽅法
        context.destroy();
    }
}
