Feature: Login
In order to verify login functionality
As a user
I want to enter valid credentials

Scenario: Verify the login functionality with valid credentials
Given user launches the application
When user entered valid username
And user entered valid password
And user clicked on Sign In button
Then user should be logged in

Scenario: Verify the login functionality with invalid credentials
Given user launches the application
When user entered invalid username
And user entered invalid password
And user clicked on Sign In button
Then user should not be logged in

