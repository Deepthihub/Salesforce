package webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import elements.Contacts_elements;
import elements.Leads_elements;
import main.Sales_main;

public class Contacts_page extends Sales_main
{
	
	public void convertLead() throws Exception
	{
		Contacts_elements.selectName.click();
		//Leads_elements.arrow.click();
		Thread.sleep(6000);
		//Leads_elements.convert.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Contacts_elements.convert);
		//Leads_elements.convertStatus.click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Contacts_elements.convertStatus);
		Thread.sleep(5000);
		Contacts_elements.convertAgain.click();
		Thread.sleep(5000);
	}
	
	public void validateConvert()
	
	{
			if(Contacts_elements.message.isDisplayed())
		{
			exttest=report.createTest("Lead Coverted To Contacts");
			exttest.log(Status.PASS, "Coverted Lead Successfully");
			takeScreenShot("Coversion_Message.png");
		}
		
			else
		{
			exttest=report.createTest("Lead Failed To Convert");
			exttest.log(Status.FAIL, "Error Occurred");
			takeScreenShot("Failed_Coversion.png");
		}
		Contacts_elements.closeWindow.click();
				
	}
	
	
	
   public void contacts() throws Exception
   {
	   //Leads_elements.contacts.click();
	   JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Contacts_elements.contacts);
		Thread.sleep(5000);
   }
   
   public void validateContacts()
   {
	   String str;
	   List<WebElement> lst=Leads_elements.table.findElements(By.xpath("//th[@scope='row']/span/a"));
	   exttest=report.createTest("Validate Contacts");
	   for(WebElement list:lst)
	   {
		str=list.getText();
		if(str.contains(userCheck)==true)
		{	   
			exttest.log(Status.PASS, "User is in Contacts");
			takeScreenShot("Userin_Contacts.png");	   
		}
		
		else
		{			
			exttest.log(Status.FAIL, "User is not in Contacts");
			takeScreenShot("Usernotin_Contacts.png");
		}
	   }
   }
	
   
   public void editUser() throws Exception
	{
		Contacts_elements.chkbox.click();
		Thread.sleep(2000);
		Contacts_elements.arrow.click();
		Contacts_elements.edit.click();
		Leads_elements.email.clear();
		Leads_elements.email.sendKeys("kumar@gmail.com");
		Leads_elements.save.click();
		Thread.sleep(4000);
		exttest=report.createTest("Editing User Details");
		exttest.log(Status.PASS, "Email Changed");
		takeScreenShot("New_Email.png");
	}
	
	public void deleteUser() throws Exception
	{
		Contacts_elements.chkbox.click();
		Thread.sleep(2000);
		Contacts_elements.arrow.click();
		Thread.sleep(2000);
		Contacts_elements.delete.click();
		Contacts_elements.deleteAgain.click();
		Thread.sleep(5000);
		exttest=report.createTest("Validating Delete");
		exttest.log(Status.PASS, "User Deleted");
		takeScreenShot("Deleted_User.png");
	}
	
	public void logout()
	{
		Contacts_elements.image.click();
		Contacts_elements.logout.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exttest=report.createTest("Logged Out");
		exttest.log(Status.PASS, "Logged Out Successfully");
		takeScreenShot("Logout.png");
	}
}


