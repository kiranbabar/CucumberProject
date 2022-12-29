Feature: Application Login
Scenario Outline: Salesforce Home Page Login

Given Initialise the chrome driver
When User navigates to "https://login.salesforce.com/?locale=in"
Then User enter <username> and <password> and click on login
Then user should be able to login

Examples:
|username|password|
|test123|secure123|
|test456|secure456| 