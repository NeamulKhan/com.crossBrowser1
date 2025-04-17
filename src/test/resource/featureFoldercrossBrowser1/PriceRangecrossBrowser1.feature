@PriceRange

Feature: Filter products by price range on category or search results page
As a user
  I want to filter products within a specific price range
  So that I can view products that match my budget

Scenario: Filter products within a valid price range

Given I am on men's watch products page
When I enter minimum price and maximum price range
Then I should see products priced between minimum and maximum prices