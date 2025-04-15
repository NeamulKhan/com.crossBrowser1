@Search

Feature: Search functionality on the AlwaysFashion homepage
As a user
  I want to search for products from the homepage
  So that I can find items I'm interested in

Scenario: User searches for a valid product keyword

Given I am on the Always Fashion homepage
When I enter "watch" into the search box
And I click the search button
Then I should see search results related to "watch"