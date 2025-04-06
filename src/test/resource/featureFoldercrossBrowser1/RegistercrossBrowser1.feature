@Registration

Feature: User Registration on Always Fashion

Scenario: Launch website and Navigate to Registration Page

Given User launches the Always Fashion website 
Then verify website homepage load successfully
When User clicks on the user icon and clicks the Registration link
Then User should be navigated to the Registration page


Scenario: Successful registration with valid details 
DataTable in cucumber BDD with header like - Feild, Value column

Given User is on the registration page
When User select gender
When User enters the following details:
      | Field           | Value              |
      | FirstName      	| John               |
      | LastName       	| Smith              |
      | Email           | johnsm1@example.com|
      | Date_of_Birth   | 6                  |
      | Month_of_Birth  | July               |
      | Year_of_Birth   | 1976               |
      | Country         | Canada             |
      | PhoneNumber    	| 506-234-5678       |
      | Password        | 123456             |
      | Confirm_Password| 123456             |
And User agrees to the terms and conditions
And User clicks on the Register button
Then User should be successfully registered


Scenario: User registration with specific data from data table 
DataTable in horizontal , no feild, value header, modify feature file for simple code

Given User is on the registration page
When User select gender
And User enters the following details from data table:
| firstName | lastName | email              | date | month   | year | country | phoneNumber | password | confirmPassword |
| Jane      | Doe      | jane.doe@test.com  | 15   | August  | 1990 | USA     | 9876543210  | Pass123    | Pass123         |
| Alice     | Bob      | alice.bob@test.com | 22   | December| 1985 | UK      | 1122334455  | Pass456    | Pass456         |
And User agrees to the terms and conditions
And User clicks on the Register button
Then User should be successfully registered



