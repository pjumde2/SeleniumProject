$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurePackage/Facebooklogin.feature");
formatter.feature({
  "line": 1,
  "name": "Facebooklogin",
  "description": "",
  "id": "facebooklogin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify Facebook Login",
  "description": "",
  "id": "facebooklogin;verify-facebook-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open \"https://www.facebook.com/\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters valid Username and valid Password",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.facebook.com/",
      "offset": 8
    }
  ],
  "location": "SmokeTest.i_open_website(String)"
});
formatter.result({
  "duration": 12740610051,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_enters_valid_Username_and_valid_Password()"
});
formatter.result({
  "duration": 682076718,
  "status": "passed"
});
});