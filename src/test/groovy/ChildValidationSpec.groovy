import com.example.demospring.ComponentDemo
import org.springframework.beans.factory.annotation.Autowired

class ChildValidationSpec extends BaseValidationSpec {

    @Autowired
    ComponentDemo demo

    def "Validate Spring test"() {
        when:
        def x = 90
        def text = demo.printHelloWorld()

        then:
        x <= 100
        text == "Hello World!!"
    }

    def "Validate Spring test 2"() {
        when:
        def x = 90
        def text = demo.printHelloWorld()

        then:
        x <= 100
        text == parentHelloWorld()
    }
}
