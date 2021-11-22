Feature: Bigsmall Automation
@1Login
Scenario: Login with valid data.
Given Initialize the browser
And User will land to Home page and click on sign in
When User enters username and password
Then Click to login button
Then browser close