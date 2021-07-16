package elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contacts_elements 
{
	@FindBy(linkText="Ajay Kumar") public static WebElement selectName;
	//@FindBy(xpath="(//button[@class='slds-button slds-button_icon-border-filled'])[2]") public static WebElement arrow;	
	//@FindBy(xpath="//a[@data-tab-name='converted']/span[2]") public static WebElement convert;
	//@FindBy(xpath="(//span[@class='title slds-path__title'])[5]") public static WebElement convert;
	//@FindBy(xpath="//ul[@class='slds-path__nav']/li[5]") public static WebElement convert;
	//@FindBy(xpath="//ul[@class='slds-path__nav']/li[5]/a/span[2]") public static WebElement convert;
	@FindBy(xpath="//div[@aria-label='Path Header']/ul/li[5]/a/span[2]") public static WebElement convert;
	//@FindBy(xpath="(//span[@class='uiOutputText'])[1]") public static WebElement convertStatus;
	@FindBy(xpath="//div[@class='slds-grid slds-path__track']/div[2]/button/span") public static WebElement convertStatus;
	@FindBy(xpath="//span[text()='Convert']") public static WebElement convertAgain;
	//@FindBy(xpath="(//div[@class='title']/span") public static WebElement message;
	@FindBy(xpath="(//div[@class='header']/div/span)[1]") public static WebElement message;
	@FindBy(xpath="//button[@title='Close this window']") public static WebElement closeWindow;
	@FindBy(xpath="//nav[@role='navigation']/div/one-app-nav-bar-item-root[3]/a/span") public static WebElement contacts;
	@FindBy(xpath="(//span[@class='slds-checkbox--faux'])[2]") public static WebElement chkbox;
	//@FindBy(xpath="//a[@title='Show 3 more actions']") public static WebElement arrow;
	@FindBy(xpath="(//span[@class='slds-icon_container slds-icon-utility-down'])[1]") public static WebElement arrow;
	@FindBy(xpath="//a[@title='Delete']") public static WebElement delete;
	@FindBy(xpath="//span[text()='Delete']") public static WebElement deleteAgain;
	@FindBy(xpath="//a[@title='Edit']") public static WebElement edit;
	@FindBy(xpath="(//span[@class='uiImage'])[1]") public static WebElement image;
	@FindBy(linkText = "Log Out") public static WebElement logout;
}
