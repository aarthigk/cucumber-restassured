@tag
Feature: My UI Sample
  I want to use this template for my feature file

  @tag1
  Scenario: To launch google and search api
    Given I want to launch google.com
    And enter api in search box
    When I click the first result
    And new page gets open
    Then I validate a text in it
    And check more outcomes


