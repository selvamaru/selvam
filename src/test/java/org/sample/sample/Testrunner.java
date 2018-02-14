package org.sample.sample;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\sample\\sample\\demodrop.feature", glue = { "org.sample.sample" })


public class Testrunner {
	
}
