Feature:Rozetka cart

  Scenario: LogIn and add goods
    Given I am on the page
    And I enter username as "10rubliv@gmail.com" and password "Windows123456"
    And I press submit button
    When I write to the search field "iphone 7"
    And I click on first link
    And I add phone to the cart
    Then I check inscription added phone
    And I remove phone from the cart