@test
Feature: This example shows the login functionality of trello

#  Background: Go to URL of Trello
#    Given User goes to Trello URL


  Scenario: User signs in with correct password and username
    Given User clicks Login link
    And User types user credentials
    Then User clicks login button

#  Scenario Outline: User signs in with correct password and username with scenario outline
#    Given User is on login page
#    And Enters correct <username> and <password>
#    And Clicks the login button
#    Then User sees the trello board
#
#    Examples:
#
#      | username   | password  |
#      | password1  | password1 |
#      | username2  | password2 |