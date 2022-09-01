Feature: Forget Password

  Scenario Outline: Forget Password
    Given I am at the forget password page
    When I type in a emai "<email>"
    And I click on the forget button on forget password page
    Then I should be redirected to login page

  Scenario Outline: Invalid Email
    Given I am at the forget password page
    When I type in a emai "<email>"
    And I click on the forget button on forget password page
    Then I should be redirected to login page

