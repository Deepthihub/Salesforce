#Author: Deepthi

@Lead
Feature: Create new lead

@Createlead
Scenario: Check the new lead button
Given user is on salesforce dashboard page
When click lead object and click New
Then user is on new lead form page

@Form
Scenario Outline: Fill the new lead form
Given user is on new lead form page
When enter <Salutation> and <FirstName> and <LastName> and <PhoneNumber> and <Email> and <Company> and <Industry> and click save
Then new lead should be created

Examples: 
|Salutation|FirstName|LastName|PhoneNumber|Email|Company|Industry|
|Mr.|Ajay|Kumar|9885985852|Ajay@gmail.com|IIFL|Finance|


@Import
Scenario: Import lead details
Given user is on lead page
When click on import
Then user should go to Home page
When click on Leads and add new records and click on CSV
Then click on choose file and select lead document and click next and click next and click import
Then new lead should be created 

@Webtolead
Scenario: Lead is generated from enquiry form
Given user is on respective website enquiry form
When enter the enquiry details
Then user details are updated in salesforce










