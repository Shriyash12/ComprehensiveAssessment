Feature: Check the Functionality of Logo.
@Clicklogo
Scenario: To check the functionality of Logo on website after navigating to some product and clicking on logo will return back to Homepage.

Given Initialize the browser
Then User will land to homepage Click All of it from Header Section
And Select the product from All of it Results
And Click on the logo on top navigate back to Landing Page
Then browser close