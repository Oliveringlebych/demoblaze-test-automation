Feature: Demo feature

  Scenario: Sign into demoblaze and buy an item
    Given I have accessed the demoblaze website
    When I have logged in
    And I add an item to the basket
    Then I can pay for that item

  Scenario: Sign into demoblaze and add an item to cart and then delete it
    Given I have accessed the demoblaze website
    When I have logged in
    And I add an item to the basket
    Then I delete that item from the basket

  Scenario: Sign into demoblaze and send a message to demoblaze
    Given I have accessed the demoblaze website
    When I have logged in
    Then I can use the contact us link to send a message