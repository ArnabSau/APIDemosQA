package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/features",
		glue = {"steps","hooks"},
		tags = "@smoke"
)


public class Runner extends AbstractTestNGCucumberTests {

}
