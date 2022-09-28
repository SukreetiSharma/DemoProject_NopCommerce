Feature: To Register user

  Scenario: To Verify user is able to Register
    Given User is on Dashboard
    When Click on Register
    And Fill all Required Details and Register
    Then Verify User is Register and Logout

  Scenario: Verify user is able to add GiftCard
    Given user is on Dashboard
    When click on Giftcard
    And Add one product to cart with Details
    And Go to shopping cart an checkout
    Then Verify user is able to send gift