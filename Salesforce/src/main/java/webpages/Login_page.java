package webpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import elements.Contacts_elements;
import elements.Leads_elements;
import elements.Login_elements;
import main.Sales_main;

public class Login_page extends Sales_main
{
	
	public void openUrl() throws Exception
	{
		PageFactory.initElements(driver,Leads_elements.class);
		PageFactory.initElements(driver,Login_elements.class);
		PageFactory.initElements(driver, Contacts_elements.class);
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	public void validateUrl()
	{
		
	}
	
	public void validLogin() throws Exception
	{
		Login_elements.salesUser.sendKeys(email);
		Login_elements.salesPass.sendKeys(pass);
		Login_elements.rememberMe.click();
		Login_elements.login.click();
		Thread.sleep(15000);		
	}
	
	public void validateLogin()
	{
		try {
	
		if(Login_elements.getStarted.isDisplayed())
		{
		exttest=report.createTest("Validate Login");
		exttest.log(Status.PASS, "Successfully Logged-in");
		}
			}
		catch(Exception e)
		{
			exttest=report.createTest("Validate Login");
			exttest.log(Status.FAIL, "Login Failed");
		}
	}	
}

	
	
	
	
	
	