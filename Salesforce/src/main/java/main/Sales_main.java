	package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sales_main 
{
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentHtmlReporter exthtml;
	public static ExtentReports report;
	public static ExtentTest exttest;
	public static String email;
	public static String pass;
	public static String userCheck;
	public static String importUser;
	
	@BeforeSuite
	public void setUp()
	{
		prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src/main/java/config/salesconfig.properties"));
		} catch(Exception e) {}
		
		if(prop.getProperty("browser").matches("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(prop.getProperty("browser").matches("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		exthtml=new ExtentHtmlReporter(prop.getProperty("reportslocation"));
		report=new ExtentReports();
		report.attachReporter(exthtml);
		report.setSystemInfo("Host Name", "Test System");
		report.setSystemInfo("Environment", "Test Env");
		report.setSystemInfo("UserName", "Deepthi");
		
		exthtml.config().setDocumentTitle("Sales Force Project");
		exthtml.config().setReportName("Leads Testing");
		exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
		exthtml.config().setTheme(Theme.STANDARD);
		
		email=prop.getProperty("username");
		pass=prop.getProperty("password");
		userCheck=prop.getProperty("checkuser");
		importUser=prop.getProperty("checkimportuser");
	}
	
	public void takeScreenShot(String image) 
	{
		try
		{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(prop.getProperty("screens")+image));
		exttest.addScreenCaptureFromPath(prop.getProperty("screens")+image);
		}catch(Exception e) {}
	}
	
	
	public void shutDown()
	{
		driver.quit();
		report.flush();
	}
	
}
