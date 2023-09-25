package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@Activity1",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true
        //plugin = {"html: test-reports"},
        //monochrome = true

        //tags = "@activity5"
        //plugin = {"pretty"},
        //monochrome = true

        //tags = "@activity1"
        //tags = "@activity2"
        //tags = "@activity3"
        //tags = "@activity4"
        //tags = "@activity5"
)

public class ActivitiesRunner {
}
