Feature: Getting Started

  As a user
  I want to on Board
  So that I can use the app

  Scenario: onboarding

    Given I am on introduction screen
    When I tap on Get started Button
    When click on i accept terms of service and click on continue button
    And fill in valid email address and click continue button
    Then I should get "Thank You" confirmation