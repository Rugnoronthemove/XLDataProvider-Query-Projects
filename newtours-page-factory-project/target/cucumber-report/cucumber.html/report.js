$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/demoaut/newtours/resources/featurefile/signOn.feature");
formatter.feature({
  "line": 1,
  "name": "SignOn Feature",
  "description": "\r\nAs a user I want to login into my account",
  "id": "signon-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16736864300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to the Sign-on page",
  "description": "",
  "id": "signon-feature;user-should-navigate-to-the-sign-on-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign-On link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Sign-On page and see the following text \"Welcome back to Mercury Tours!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignOnSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 338771100,
  "status": "passed"
});
formatter.match({
  "location": "SignOnSteps.iClickOnSignOnLink()"
});
formatter.result({
  "duration": 854633800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome back to Mercury Tours!",
      "offset": 62
    }
  ],
  "location": "SignOnSteps.iShouldNavigateToSignOnPageAndSeeTheFollowingText(String)"
});
formatter.result({
  "duration": 92180600,
  "status": "passed"
});
formatter.after({
  "duration": 1103715900,
  "status": "passed"
});
});