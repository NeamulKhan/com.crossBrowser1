@Registration2

Feature: User Registration2 on Always Fashion

 Scenario Outline: Register user with valid details
    Given User is on the registration2 page
    When User selects gender for registration2
    And User enters registration2 details: "<firstName>", "<lastName>", "<email>", "<date>", "<month>", "<year>", "<country>", "<phoneNumber>", "<password>", "<confirmPassword>"
    And User agrees to the terms and conditions for registration2
    And User clicks on the Register2 button
    Then User should be successfully registered2

  Examples:
    | firstName | lastName | email              | date | month    | year | country | phoneNumber | password | confirmPassword |
    | Jane      | Doe      | jane.doe@test.com  | 15   | August   | 1990 | USA     | 2126543210  | Pass123  | Pass123         |
    | Alice     | Bob      | alice.bob@test.com | 22   | December | 1985 | UK      | 1212334455  | Pass456  | Pass456         |