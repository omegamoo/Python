$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/jimawesome/PycharmProjects/Python/trello/src/test/java/features/LoginToTrello.feature");
formatter.feature({
  "name": "This example shows the login functionality of trello",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "User signs in with correct password and username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
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
formatter.after({
  "status": "passed"
});
});