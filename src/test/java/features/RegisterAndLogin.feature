@feature
Feature: Register and Login

  @register
  Scenario: Register to page
    # Open Url -> Hooks
    Given Open Register page
    When Input First name textbox
    And Input Last name textbox
    And Input Email textbox
    And Input Password textbox
    And Input ConfirmPassword textbox
    And Click to Submit
    Then Verify Success Message is displayed
    Then Click to My Account link
    And Click to Logout

    @login
    Scenario: Login to page
    Given Open Login page
    When Input Email login textbox
    And Input Password login textbox
    And Click to Login button
    Then Verify My account link is display