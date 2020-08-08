package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature", glue = "stepDefination")
public class TestRunnner {
	
//	public class TestRunnner extends AbstractTestNGCucumberTests { this is required to run cucumber tests as test ng from framework

}
