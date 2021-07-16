package testsuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/testsuite/newLead.feature"},
		glue = {"testsuite"},
		tags = "@Lead"
		)

@RunWith(Cucumber.class)
public class Lead_Run extends AbstractTestNGCucumberTests
{
	
}
