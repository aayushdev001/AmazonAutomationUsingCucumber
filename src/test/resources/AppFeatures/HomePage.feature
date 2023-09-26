Feature: Home page feature

  Background:
    Given user has already signed into the application
      | username   | password      |
      | 9452361808 | blackberryz3 |

  Scenario: Search results
    When user is on Home page
    And user enters "Lg 1.5 ton air conditioner" in the search box
    And clicks on the search button
    Then he should be taken to the search results page
