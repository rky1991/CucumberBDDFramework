package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Regression1",features = "src/test/resources/features" , glue = "stepDefinition", plugin = {"pretty", "json:target/report/cucumber-json-report.json",
        "html:target/report/cucumber-html-report.html"}, monochrome = true, dryRun = false)

public class TestRunner {

    //dryRun --> Check all feature file scenario have step definition.



}
