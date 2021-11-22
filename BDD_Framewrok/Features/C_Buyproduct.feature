Feature: Search the product and Buy the product.
@Buyproduct
Scenario Outline: To check the functionality of buying the product

Given Initialize the browser
When User will land to homepage and Search for <product> by entering keys in Search bar
Then Select the product
Then Add product to cart to buy
Then Add to checkout
Then User cut the whatsapp login
Then Fill the Delivery details <mail> <fname> <lname> <add> <landmark> <state> <city> <pin> and <phone> continue
Then Continue shopping order placed
Then browser close


Examples:
|product     |mail                     |fname   | lname   |add    |landmark | state        |pin   |phone     |
|harry potter|demo.shriyash12@gmail.com|Shriyas |Nilawar  | Nagpur |Nagpur  | Maharahstra |445001|9087654321|