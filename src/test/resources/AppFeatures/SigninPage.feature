Feature: Signin page feature

  Scenario: Signin page title
    Given user is on Home page
    When user opens sign in window
    And user enters username as "9452361808"
    And user enters password as "blackberryz3"
    And user clicks on signin button
    Then user should be signedin
    And title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"