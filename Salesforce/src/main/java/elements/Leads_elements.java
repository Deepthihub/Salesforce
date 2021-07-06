package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leads_elements 
{
		@FindBy(name="username") public static WebElement salesUser;
		@FindBy(id="password") public static WebElement salesPass;
		@FindBy(name="Login") public static WebElement login;
		@FindBy(xpath="(//input[@type='checkbox'])[1]") public static WebElement rememberMe;	
		@FindBy(xpath="(//ul[@class='slds-global-actions']/li)[7]") public static WebElement setUp;
		//@FindBy(xpath="((//div[@class='uiMenu'])[2]/div/div/div/a/div/span") public static WebElement setUp2;
		@FindBy(xpath="(//div[@class='uiMenu'])[2]/div/div/div/a/div/lightning-icon") public static WebElement setUp2;
		//@FindBy(xpath="//span[text()='Leads']") public static WebElement leads;
		@FindBy(xpath="(//span[text()='Leads'])[1]") public static WebElement leads;
		@FindBy(xpath="//div[@title='New']") public static WebElement newLead;
		@FindBy(xpath="//lightning-base-combobox-item[@data-value='Mr.']") public static WebElement salutation;
		@FindBy(name="firstName") public static WebElement fName;
		@FindBy(name="middleName") public static WebElement mName;
		@FindBy(name="lastName") public static WebElement lName;
		@FindBy(name="Company") public static WebElement company;
		@FindBy(name="Title") public static WebElement title;
		@FindBy(name="Email") public static WebElement email;
		@FindBy(name="Phone") public static WebElement phoneNumber;
		@FindBy(name="MobilePhone") public static WebElement mobileNumber;
		@FindBy(name="suffix") public static WebElement suffix;
		@FindBy(id="input-956") public static WebElement industry;
		@FindBy(name="NumberOfEmployees") public static WebElement noOfEmp;
		@FindBy(id="input-972") public static WebElement leadSource;
		@FindBy(xpath="//input[@placeholder='Search Address']") public static WebElement address;
		@FindBy(name="street") public static WebElement streetName;
		@FindBy(name="postalCode") public static WebElement pincode;
		@FindBy(name="Website") public static WebElement website;
		@FindBy(id="input-981") public static WebElement rating;
		@FindBy(name="SaveEdit") public static WebElement save;
		@FindBy(linkText="Ravi Kumar Reddy M") public static WebElement selectName;
		@FindBy(xpath="(//button[@class='slds-button slds-button_icon-border-filled'])[2]") public static WebElement arrow;
		@FindBy(xpath="//span[text()='Convert']") public static WebElement convert;
		@FindBy(xpath="(//span[@class='uiOutputText'])[4]") public static WebElement message;
		@FindBy(xpath="//button[@title='Close this window']") public static WebElement closeWindow;
		@FindBy(linkText="Opportunities") public static WebElement opportunities;
		
		
		
		
		
		
}
