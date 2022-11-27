Feature: Login fails using invalid credentials

  As a user,
  I want to receive error message if I try to access website using invalid credentials
  So that I know valid credentials is necessary to use the application

  Background:
    Given user is on the signin page

    Scenario: Signin fails using invalid username and invalid password
      When user enters invalid username
      And user enters invalid password
      And user clicks on signin button
      Then user is redirected back to signin page
      And error message is displayed in signin page

#    Scenario: Signin fails using valid username and invalid password
