package cucumber_options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step_definition",
        features = "src/test/java/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json" })
public class TestRunner {
}