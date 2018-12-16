Feature: Login to adactin app	

Scenario: Successful Login
Given user enters the login page
When user enters username and password
Then user successfully login

Scenario: Obtain OrderID
When user enters details
Then Orderid is Obtained