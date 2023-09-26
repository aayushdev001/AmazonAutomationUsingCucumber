Feature: Cart page feature
  Background:
    Given user has already signed into the application
      | username   | password     |
      | 9452361808 | blackberryz3 |
    Given user is on the search results page of "Lg 1.5 ton air conditioner" search
    Given User should be on the product page
    Given User should have moved to the cart page

  Scenario: Checkout the product from the cart
    When user clicks on the checkout button
    Then user should land on the checkout page