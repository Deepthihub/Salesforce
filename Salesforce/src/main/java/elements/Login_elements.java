package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_elements 
{

	@FindBy(name="username") public static WebElement salesUser;
	@FindBy(id="password") public static WebElement salesPass;
	@FindBy(name="Login") public static WebElement login;
	@FindBy(xpath="(//input[@type='checkbox'])[1]") public static WebElement rememberMe;	
	@FindBy(xpath="//a[text()='Get Started") public static WebElement getStarted;
	
	
	
}
