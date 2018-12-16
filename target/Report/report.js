$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("automation.feature");
formatter.feature({
  "line": 1,
  "name": "Login to adactin app",
  "description": "",
  "id": "login-to-adactin-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login",
  "description": "",
  "id": "login-to-adactin-app;successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enters the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_login_page()"
});
formatter.result({
  "duration": 15282416037,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2149644128,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_successfully_login()"
});
formatter.result({
  "duration": 14635590,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Obtain OrderID",
  "description": "",
  "id": "login-to-adactin-app;obtain-orderid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user enters details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Orderid is Obtained",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_details()"
});
formatter.result({
  "duration": 4757881764,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.orderid_is_Obtained()"
});
formatter.result({
  "duration": 5780452894,
  "status": "passed"
});
});