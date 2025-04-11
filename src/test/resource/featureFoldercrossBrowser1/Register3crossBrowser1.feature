@Registration3

Feature: User Registration3 on Always Fashion

 Scenario Outline: Register user with valid details
    Given User is on the registration3 page
    When User selects gender for registration3
    And User enters "<first.name>", "<last.name>", and "<email>" 
    And selects "<date.of.birth>", "<month.of.birth>", "<year.of.birth>"
    And selects country, enter "<phone.number>", "<password>", and "<confirm.password>"
    And User agrees to the terms and conditions for registration3
    And User clicks on the Register3 button
    Then verify user should be successfully registered3

 