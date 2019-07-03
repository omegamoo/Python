$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/jimawesome/PycharmProjects/Python/trello/src/test/java/features/PersonalBoard.feature");
formatter.feature({
  "name": "This example shows the interactions in the personal board",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "Login To Trello",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Login link",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginToTrello.user_clicks_Login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types user credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToTrello.user_types_user_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToTrello.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User signed in with correct password and username accessing personal board",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User clicks LifeGoals from the personal boards",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalBoard.user_clicks_LifeGoals_from_the_personal_boards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks AddAnotherCardlink",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User types testText",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalBoard.user_types_testText()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks AddCard button",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalBoard.user_clicks_AddCard_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});