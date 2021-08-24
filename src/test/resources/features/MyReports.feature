@MyReports
  Feature: My Reports

    Scenario: My Reports
      Given I am on the main page
      When I click File Center module
      Then I make sure there is no "My Reports" module
      Then I click on the user icon
      And I click the "Start Impersonating" link
      Then I add "Bob Backline" as the username
      And I click the "Start Impersonating" button
      Then I click on the My Reports button
      And I am in the My Reports module