Feature: SignOn Feature

  As a user I want to login into my account

  Scenario: User should navigate to the Sign-on page
    Given I am on Home page
    When  I click on Sign-On link
    Then  I should navigate to Sign-On page and see the following text "Welcome back to Mercury Tours!"