package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leads_elements 
{
		
		//@FindBy(xpath="//span[text()='Leads']") public static WebElement leads;
		@FindBy(xpath="//nav[@role='navigation']/div/one-app-nav-bar-item-root[4]/a/span") public static WebElement leads;
		//@FindBy(xpath="//div[@class='slds-grid slds-has-flexi-truncate navUL']/one-app-nav-bar-item-root[4]/a/span") public static WebElement leads;
		//@FindBy(xpath="(//a[@role='button'])[5]") public static WebElement leads;
		//@FindBy(xpath="//a[@title='Leads']") public static WebElement leads;
		//@FindBy(linkText = "Leads") public static WebElement leads;
		
		@FindBy(xpath="//div[@title='New']") public static WebElement newLead;
		@FindBy(xpath="//h2[text()='New Lead']") public static WebElement newLeadHead;
		//@FindBy(xpath="//lightning-base-combobox-item[@data-value='Mr.']") public static WebElement salutation;
		@FindBy(xpath="//input[@name='salutation']") public static WebElement salutation;
		@FindBy(xpath="//input[@name='firstName']") public static WebElement fName;
		@FindBy(xpath="//input[@name='middleName']") public static WebElement mName;
		@FindBy(xpath="//input[@name='lastName']") public static WebElement lName;
		@FindBy(xpath="//input[@name='Company']") public static WebElement company;
		@FindBy(xpath="//input[@name='Email']") public static WebElement email;
		@FindBy(xpath="//input[@name='Phone']") public static WebElement phoneNumber;		
		@FindBy(xpath="(//input[@type='text'])[14]") public static WebElement industry;		
		
		@FindBy(xpath="//button[@name='SaveEdit']") public static WebElement save;		
		
		@FindBy(xpath="(//span[@class='slds-checkbox--faux'])[2]") public static WebElement chkbox;
		//@FindBy(xpath="//a[@title='Show 3 more actions']") public static WebElement arrow;
		@FindBy(xpath="(//span[@class='slds-icon_container slds-icon-utility-down'])[1]") public static WebElement arrow;		
		@FindBy(xpath="//table[@data-aura-class='uiVirtualDataTable']/tbody") public static WebElement table;
		
		@FindBy(xpath="//button[@title='Select List View']") public static WebElement leadsList;
		@FindBy(xpath="//ul[@class='slds-dropdown__list slds-show']/li[6]/a/span") public static WebElement todayLead;
		
		@FindBy(xpath="//div[@title='Import']") public static WebElement importLead;
		//@FindBy(xpath="//a[text()='Leads']") public static WebElement leadsinImport;
		@FindBy(xpath="//iframe[@title='accessibility title']") public static WebElement frame;
		@FindBy(xpath="(//table[@class='list-view list-view-links'])[1]/tbody/tr[2]/td/a") public static WebElement leadsinImport;
		@FindBy(xpath="//a[text()='Add new records']") public static WebElement addnew;
		@FindBy(xpath="//span[text()='CSV']") public static WebElement csv;
		@FindBy(xpath="//input[@name='file']") public static WebElement chooseFile;
		//@FindBy(xpath="//div[@class='selectFile']/form/input]") public static WebElement chooseFile;
		@FindBy(xpath="(//a[@class='button success uiOutputURL'])[2]") public static WebElement next;
		@FindBy(xpath="(//a[@class='button success uiOutputURL'])[2]") public static WebElement next1;
		@FindBy(xpath="(//a[@class='button success uiOutputURL'])[2]") public static WebElement startImport;
		@FindBy(xpath="(//a[@class='button success uiOutputURL'])[2]") public static WebElement okButton;
		
		
		
		
		
		
}
