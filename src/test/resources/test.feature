Feature: test

  Scenario Outline: As a user I want to signup and login
    Given I am new user with "<email>" and
    When I get Krystals
    And add kristal to bookmark
    Then assert kristal is added to bookmark


    Examples:
      |email  |
      |deepakjagdambakumar@gmail.com|
