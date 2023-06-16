import com.example.demospring.ComponentDemo
import com.example.demospring.DemoSpringApplication
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = DemoSpringApplication.class)
class BaseValidationSpec extends Specification {

    @Autowired
    ComponentDemo demo

    def "Validate Spring test"() {
        when:
        def x = 90
        def y = 100
        def text = demo.printHelloWorld()

        then:
        x <= 100
        text == "Hello World!!"
    }
}
