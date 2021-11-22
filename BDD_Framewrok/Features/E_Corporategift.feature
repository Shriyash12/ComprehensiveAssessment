Feature: Enquiry for Corporate gifts.
@Corporategift
Scenario Outline: To check the functionality and put inquiry for Corporate gifts

Given Initialize the browser
Then User will land to homepage and Select Corporate Gifts from Navigation Bar
Then Enter the Details in the form <name> and <email> and <phone> and <inquiry>
Then Hit the inquire now
Then browser close

Examples:
|name    |email      |phone     |inquiry                    |
|Shriyash|xyz@abc.com|9087654321|Inquiry for corporate gifts|