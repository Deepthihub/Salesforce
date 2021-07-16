package testsuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.Contacts_page;

public class Contactsstep 
{
	Contacts_page contact=new Contacts_page();
	
	@Given("^user is on leads page$")
    public void user_is_on_leads_page() throws Throwable 
	{
        
    }

    @When("^click on name and click on convert$")
    public void click_on_name_and_click_on_convert() throws Throwable
    {
        contact.convertLead();
        contact.validateConvert();
    }

    @Then("^lead should appear in Contacts$")
    public void lead_should_appear_in_contacts() throws Throwable 
    {
        contact.contacts();
        contact.validateContacts();
    	
    }
    
    @Given("^user is on contacts page$")
    public void user_is_on_contacts_page() throws Throwable
    {
       
    }

    @When("^select edit and modify data and click save$")
    public void select_edit_and_modify_data_and_click_save() throws Throwable 
    {
        contact.editUser();
    }

    @Then("^user details should get updated in contacts$")
    public void user_details_should_get_updated_in_contacts() throws Throwable
    {
        
    }
    
    @When("^select delete and click delete$")
    public void select_delete_and_click_delete() throws Throwable
    {
       contact.deleteUser();
    }

    @Then("^user should get deleted in contacts$")
    public void user_should_get_deleted_in_contacts() throws Throwable
    {
        contact.validateContacts();
        try {
        contact.logout();
        }catch(Exception e) {e.printStackTrace();}
        contact.shutDown();
    }


}
