@sampleFeature 
Feature: user registration
As a site visitor
I want to go registration page

Scenario: registrar a user successfully
Given  as a user i am in registration page
When i eneter first name , last name , user id, password and confirm password
And when i click submit button 
Then i receieved a user reigtration confirmation
