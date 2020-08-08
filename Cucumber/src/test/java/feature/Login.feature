Feature: Application Login
Scenario Outline: Login button click
Given User is on Landing page of <URL>
When User click on Login button
Then User redirect to Login page
And User id password text field displayed


Examples: 
|URL						|
|http://google.co.in		|
|http://flipkart.com		|
|http://qaclickacademy.com	|


