#Author: Deepthi

@Contacts
Feature: Convert lead 

Scenario: Convert lead to contacts
Given user is on leads page
When click on name and click on convert
Then lead should appear in Contacts

Scenario: Edit lead
Given user is on contacts page
When select edit and modify data and click save
Then user details should get updated in contacts

Scenario: Delete lead
When select delete and click delete
Then user should get deleted in contacts