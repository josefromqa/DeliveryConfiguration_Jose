
  @Logout
    Feature: Logout feature
      Scenario: Logout
        When I click the Icon on the top right side
        And I should be able to select "sign out"
        Then I should be able to logout
