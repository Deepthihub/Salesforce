package testsuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/testsuite/Contacts.feature"},
		glue= {"testsuite"},
		tags= "@Contacts"
		)

@RunWith(Cucumber.class)
public class Contacts_Run extends AbstractTestNGCucumberTests {

}
