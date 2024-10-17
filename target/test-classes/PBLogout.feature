@regression
Feature: Parabank logout testing
Description: User should have a login account
Background: User should be logged in
Scenario Outline: As a logged in user, I want to logout from the Parabank website, so that my 
account inofrmation is safe
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And Enter the password "<password>"
And click on Login button
And click on Logout button
Then Validate logout is successful
Given Quit all browser
Examples:
|URL  																													|username|password  |
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC	|rezwan  |Boston2023|