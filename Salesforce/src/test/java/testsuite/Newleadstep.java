package testsuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.Leads_page;
import webpages.Login_page;

public class Newleadstep 
{

	Login_page login=new Login_page();
	Leads_page lp=new Leads_page();
	
	@Given("^user is on salesforce dashboard page$")
    public void user_is_on_salesforce_dashboard_page() throws Throwable
	{
        
    }

    @When("^click lead object and click New$")
    public void click_lead_object_and_click_new() throws Throwable 
    {
        lp.clickLead();
        lp.clickNewLead();
    }
    
    @Given("^user is on new lead form page$")
    public void user_is_on_new_lead_form_page() throws Throwable 
    {
        lp.validateLeadForm();
    }

    @When("^enter (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and click save$")
    public void enter_and_and_and_and_and_and_and_click_save(String salutation, String firstname, String lastname, String phonenumber, String email, String company, String industry) throws Exception 
    {
        lp.leadDetails(salutation, firstname, lastname, phonenumber, email, company, industry);
    }
        

    @Then("^new lead should be created$")
    public void new_lead_should_be_created() throws Throwable 
    {
    	lp.clickLead();
        lp.validateLead();
    }
    
    @Given("^user is on lead page$")
    public void user_is_on_lead_page() 
    {
        
    }

    @When("^click on import$")
    public void click_on_import() throws Throwable
    {
        
    }

    @When("^click on Leads and add new records and click on CSV$")
    public void click_on_leads_and_add_new_records_and_click_on_csv() throws Throwable
    {
        
    }

    @Then("^user should go to Home page$")
    public void user_should_go_to_home_page() 
    {
        
    }

    @Then("^click on choose file and select lead document and click next and click next and click import$")
    public void click_on_choose_file_and_select_lead_document_and_click_next_and_click_next_and_click_import() throws Exception 
    {
        lp.importLead();
        lp.validateLead();
    }

    
    

	@Given("^user is on respective website enquiry form$")
	public void user_is_on_respective_website_enquiry_form() throws Throwable {
	    
	}
	
	@When("^enter the enquiry details$")
	public void enter_the_enquiry_details() throws Throwable {
	    
	}
	
	@Then("^user details are updated in salesforce$")
	public void user_details_are_updated_in_salesforce() throws Throwable {
	    
	}
	}










