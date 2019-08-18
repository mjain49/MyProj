package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/stepDefinition/User.feature", glue="src/test/java/stepDefinition")
public class UserTestRunner {

}
