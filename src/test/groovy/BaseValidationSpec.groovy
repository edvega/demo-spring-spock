import com.example.demospring.DemoSpringApplication
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = DemoSpringApplication.class)
class BaseValidationSpec extends Specification {

    def parentHelloWorld() {
        "Hello World!!"
    }
}
