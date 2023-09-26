Feature: Product page feature
  Background:
    Given user has already signed into the application
      | username   | password     |
      | 9452361808 | blackberryz3 |
    Given user is on the search results page of "Lg 1.5 ton air conditioner" search
    Given User should be on the product page

  Scenario: Add the product to the cart
    When user is on the product page
    And user clicks the add to cart button
    Then product should be added to cart