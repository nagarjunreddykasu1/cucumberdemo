@login
Feature: Login
In order to verify login functionality
As a user
I want to enter valid credentials

Background:
Given user launches the application

@sanity
Scenario: Verify the login functionality with valid credentials
When user entered valid username
And user entered valid password
And user clicked on Sign In button
Then user shouldbe logged in

@regression
Scenario: Verify the login functionality with invalid credentials
When user entered invalid username
And user entered invalid password
And user clicked on Sign In button
Then user shouldnotbe logged in

#Scenario Outline: Verify the login functionality with valid credentials
#Given user launches the application
#When user entered "<username>" username
#And user entered "<password>" password
#And user selected age category
#|age			|location	|
#|below 18	|Hyderabad|
#|above 18	|Vizag		|
#And user clicked on Sign In button
#Then user "<result>" logged in
#
#Examples:
#|username	|password	|result			|
#|valid		|valid		|shouldbe		|
#|invalid	|	invalid	|shouldnotbe|


