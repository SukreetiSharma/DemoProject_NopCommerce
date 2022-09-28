Feature: To Register user

  Scenario: To Verify user is able to Register
    Given User is on Dashboard
    When Click on Register
    And Fill all Required Details and Register
    Then Verify User is Register and Logout
