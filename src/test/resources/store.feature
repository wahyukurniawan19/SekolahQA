Feature: Title of your feature

  Scenario: Function Button Login
    Given I visit "http://qa.cilsy.id:31300/id/"
    When I press the login button
    Then I verify the text AUTHENTICATION in step

  Scenario: Function Logo Keranjang
    Given I visit "http://qa.cilsy.id:31300/id/"
    When I press the keranjang button
    Then I verify the text YOUR BOOKING CART in step

  Scenario: Function Burger Menu Home
    Given I press the burger Menu
    When I press the Home Menu
    Then I verify the text Welcome To in step





    


