Feature: Reset Password

  Scenario Outline: Reset Password
    Given I am at the reset password page
    When I type in a email "<email>"
    AND I type new password "<password>"
    AND I type confirm password "<confirm_password>"
    And I click on the reset password button on reset password page
    Then I should be redirected to login page


