package webpages;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import elements.Contacts_elements;
import elements.Leads_elements;
import main.Sales_main;

public class Leads_page extends Sales_main
{

	public void clickLead() throws Exception
	{
		//Leads_elements.leads.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Leads_elements.leads);
		Thread.sleep(2000);
	}
	
	public void clickNewLead() throws Exception
	{
		Leads_elements.newLead.click();
		Thread.sleep(5000);
	}
	
	public void validateLeadForm()
	{
		try {
		if(Leads_elements.newLeadHead.isDisplayed())
		{
			exttest=report.createTest("Form Page Displayed");
			exttest.log(Status.PASS, "Form Page Opened");
			takeScreenShot("Form_Page.png");
		}
		}
		catch(Exception e)
		{
			exttest=report.createTest("Form Page Not Displayed");
			exttest.log(Status.FAIL, "Form Page Not Opened");
			takeScreenShot("FormPage_Error.png");
		}
	}
	
	public void leadDetails(String salutation,String firstName,String lastName,String phoneNumber,String email,String company,String industry) throws Exception
	{
		Leads_elements.salutation.sendKeys(salutation);
		Leads_elements.salutation.sendKeys(Keys.ENTER);
		Leads_elements.fName.sendKeys(firstName);
		//Leads_elements.mName.sendKeys("Kumar");
		Leads_elements.lName.sendKeys(lastName);
		Leads_elements.phoneNumber.sendKeys(phoneNumber);
		Leads_elements.email.sendKeys(email);
		Leads_elements.company.sendKeys(company);		
		Thread.sleep(3000);
		Leads_elements.industry.sendKeys(industry);
		Thread.sleep(3000);
		Leads_elements.industry.sendKeys(Keys.ENTER);
		Leads_elements.save.click();	
		Thread.sleep(3000);
	}
	
	public void validateLead() throws Exception
	{
		Leads_elements.leadsList.click();
		Leads_elements.todayLead.click();
		Thread.sleep(3000);
		
		String str;
		   List<WebElement> lst=Leads_elements.table.findElements(By.xpath("//th[@scope='row']/span/a"));
		   exttest=report.createTest("Validate Leads");
		   for(WebElement list:lst)
		   {
			str=list.getText();		
		
		if(str.contains(userCheck)==true || str.contains(importUser))
		{
		
		exttest.log(Status.PASS, "Lead created successfully");
		takeScreenShot("Created_Lead.png");
		}
		
		else
		{
			
			exttest.log(Status.FAIL, "Lead not created");
			takeScreenShot("Leadcreation_Error.png");
		}
	}
}
	
	public void importLead() throws Exception
	{
		Leads_elements.importLead.click();		
		Thread.sleep(6000);	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='accessibility title']")));
		Leads_elements.leadsinImport.click();
		Leads_elements.addnew.click();
		Leads_elements.csv.click();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,200)"); //To scroll down		
		Leads_elements.chooseFile.sendKeys("D:\\Selenium\\Lead.csv");
		Thread.sleep(5000);	
		//Runtime.getRuntime().exec("D:\\sales.exe");		
		Leads_elements.next.click();
		Thread.sleep(3000);
		Leads_elements.next1.click();
		Thread.sleep(3000);
		Leads_elements.startImport.click();
		Thread.sleep(3000);
		//Alert a=driver.switchTo().alert();
		//a.accept();
		Leads_elements.okButton.click();
		Thread.sleep(8000);
		//Leads_elements.leadsList.click();
		//Leads_elements.todayLead.click();
		
	}
	
	public void webToLead()
	{
		
	}
}
	
	





