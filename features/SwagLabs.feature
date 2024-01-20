Feature: OrangeHRM Login

  Scenario: Logo present in Swaglab home page
    Given I launch chrome browser
    When I open SwagLab homepage
    Then I verify that the logo on page
    And close browser
