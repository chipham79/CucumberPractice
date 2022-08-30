package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/loginStaging.feature", glue = {"steps"}, plugin = {"html:target/cucumber-reports/report.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCucumber extends AbstractTestNGCucumberTests
{

}
