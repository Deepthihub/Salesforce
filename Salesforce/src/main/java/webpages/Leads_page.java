package webpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import elements.Leads_elements;
import main.Sales_main;

public class Leads_page extends Sales_main
{

	public void openUrl() throws Exception
	{
		PageFactory.initElements(driver, Leads_elements.class);
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	public void login() throws Exception
	{
		Leads_elements.salesUser.sendKeys("deepu.reddy2203-dv8s@force.com");
		Leads_elements.salesPass.sendKeys("salesforce1");
		Leads_elements.rememberMe.click();
		Leads_elements.login.click();
		Thread.sleep(15000);
		
	}
	
	public void clickNewLead() throws Exception
	{
		Leads_elements.leads.click();
		Thread.sleep(2000);
		Leads_elements.newLead.click();
	}
	
	public void setup() throws Exception
	{
		Leads_elements.setUp.click();
		Thread.sleep(3000);
		Leads_elements.setUp2.click();
		Thread.sleep(3000);
	}
	
	public void leadDetails() throws Exception
	{
		Leads_elements.salutation.click();
		Leads_elements.fName.sendKeys("Nitish");
		Leads_elements.mName.sendKeys("Kumar");
		Leads_elements.lName.sendKeys("Reddy");
		Leads_elements.suffix.sendKeys("B");
		Thread.sleep(2000);
		Leads_elements.title.sendKeys("New Customer");
		Leads_elements.company.sendKeys("Microsoft");
		Leads_elements.email.sendKeys("nitishk@gmail.com");
		Thread.sleep(2000);
		Leads_elements.industry.sendKeys("Bank");
		Thread.sleep(2000);
		Leads_elements.industry.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Leads_elements.phoneNumber.sendKeys("0405749841");
		Leads_elements.noOfEmp.sendKeys("60");
		Leads_elements.mobileNumber.sendKeys("9876543210");
		Thread.sleep(2000);
		Leads_elements.leadSource.sendKeys("Advert");
		Thread.sleep(2000);
		Leads_elements.leadSource.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Leads_elements.address.sendKeys("Hyderabad");
		Thread.sleep(2000);
		Leads_elements.address.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Leads_elements.streetName.sendKeys("dhfdfgdfjghdjgdg");
		Leads_elements.pincode.sendKeys("500072");
		Thread.sleep(2000);
		Leads_elements.save.click();	
		Thread.sleep(2000);
		exttest=report.createTest("New Lead Created");
		exttest.log(Status.PASS, "Lead created successfully");
		takeScreenShot("Created_Lead.png");
	}
	
	public void convertLead()
	{
		Leads_elements.selectName.click();
		Leads_elements.arrow.click();
		Leads_elements.convert.click();
		Leads_elements.convert.click();	
		String str=Leads_elements.message.getText();
		exttest=report.createTest("Covert Lead To Opportunity");
		exttest.log(Status.PASS, str);
		takeScreenShot("Coversion_Message.png");
	}
	
   public void opportunity()
   {
	   Leads_elements.opportunities.click();
	   exttest=report.createTest("Opportunity");
	   exttest.log(Status.PASS, "Lead appeared in Opportunity");
	   takeScreenShot("Leadin_Opportunity.png");
   }
	
}





