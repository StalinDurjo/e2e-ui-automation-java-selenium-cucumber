Feature: Login using valid credentials

  As a user,
  I want to login to the application using valid credentials
  So that I know valid user information is required for users to access the website

  Scenario: Login to website using valid credentials
    Given user is on the signin page
    When user enters valid username
    And user enters valid password
    And user clicks on signin button
    Then user is validated and redirected to homepage

  Scenario: User login credentials are saved in cookie for 30 days
    Given user is on the signin page
    When user has entered valid credentials and clicked on remember me button
    And user clicks on signin button
    Then user is validated and redirected to homepage
    And user cookie is saved in browser

