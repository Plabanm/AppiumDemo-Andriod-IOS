Feature: View terms pages

  As a user
  I want to view terms pages
  So that I know about terms

  Scenario: See terms of service
    Given I am on introduction screen
    When I tap on Get started Button
    And I click on terms of service
    Then I can view the terms of service


  Scenario: See privacy policy
    Given I am on introduction screen
    When I tap on Get started Button
    And I click on privacy policy
    Then I can view the privacy policy
