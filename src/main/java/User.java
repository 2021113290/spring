import org.springframework.stereotype.Controller;

@Controller
public class User {
    public String sayHi(String name) {
        return name + " hello!";
    }
}
