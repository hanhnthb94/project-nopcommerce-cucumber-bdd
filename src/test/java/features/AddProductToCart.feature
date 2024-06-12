Feature: Add product to cart

  @add_product
  Scenario: add product to cart
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