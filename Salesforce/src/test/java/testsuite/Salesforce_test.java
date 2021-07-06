package testsuite;

import org.testng.annotations.Test;

import webpages.Leads_page;

@Test
public class Salesforce_test 
{

	public void Lead_test() throws Exception
	{
	Leads_page lp = new Leads_page();
	
	lp.openUrl();
	lp.login();
	lp.setup();
	//lp.clickNewLead();
	//lp.leadDetails();
	//lp.convertLead();
	//lp.opportunity();
	
	
	}
}
