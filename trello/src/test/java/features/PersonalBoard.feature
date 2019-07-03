@test
Feature: This example shows the interactions in the personal board

  Background: Login To Trello
    Given User clicks Login link
    And User types user credentials
    Then User clicks login button

  Scenario: User signed in with correct password and username accessing personal board
    Given User clicks LifeGoals from the personal boards
    And User clicks AddAnotherCardlink
    And User types testText
    Then User clicks AddCard button

