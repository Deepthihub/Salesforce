package testsuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/testsuite/Login.feature"},
		glue = {"testsuite"},
		tags = "@Login"
		)

@RunWith(Cucumber.class)
public class Login_Run extends AbstractTestNGCucumberTests
{
	
}
	