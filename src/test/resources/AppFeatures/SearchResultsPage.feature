Feature: Search results page feature
  Background:
    Given user has already signed into the application
      | username   | password     |
      | 9452361808 | blackberryz3 |
    Given user is on the search results page of "Lg 1.5 ton air conditioner" search

  Scenario: Open the product page
    When user clicks on the product
    Then user should land on the product page