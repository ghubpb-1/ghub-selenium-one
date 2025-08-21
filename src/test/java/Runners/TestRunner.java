package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = "com.themefreeasia.SummerCol", // Path to the step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting options
        monochrome = true // Makes the console output more readable
)

public class TestRunner {
}
