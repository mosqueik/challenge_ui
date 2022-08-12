package suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "classpath:features"
        },
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        glue = { "steps" },
        tags = ""
)
public class QATestRunner {
}
