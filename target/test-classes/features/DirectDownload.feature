@DirectDownload
Feature: As a user, I should be able to access a file by direct download link

  Scenario: Direct download of a file
    Given I put the URL in the browser
    When I type "Bob Backline" as the user name
    Then The file downloads immediately