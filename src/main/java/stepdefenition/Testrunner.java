package stepdefenition;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\demoqa.feature", glue = { "org.sample.sample" })


public class Testrunner {
	
}
