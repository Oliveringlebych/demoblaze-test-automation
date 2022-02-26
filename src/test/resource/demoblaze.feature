Feature: Demo feature

  Scenario: Sign into demoblaze and buy an item
    Given I have accessed the demoblaze website
    When I have logged in
    And I add an item to the basket
    Then I can pay for that item

  Scenario: Demonstrating how Cucumber-JVM works
    Given I have accessed the demoblaze website
    When I have logged in
    And I add an item to the basket
    Then I delete that item from the basket