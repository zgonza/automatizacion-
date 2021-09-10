$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/compraonline.feature");
formatter.feature({
  "name": "online purchase",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "summer dress purchase",
  "description": "Since I login in the online store",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select the category of summer dresses",
  "keyword": "And "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.iSelectTheCategoryOfSummerDresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the most economical dress from the list of results",
  "keyword": "And "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.iSelectTheMostEconomicalDressFromTheListOfResults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I buy the dress",
  "keyword": "When "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.iBuyTheDress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "payment by check",
  "keyword": "And "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.paymentByCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I bought the dress",
  "keyword": "Then "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.iBoughtTheDress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering the purchase history",
  "keyword": "When "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.enteringThePurchaseHistory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the purchase order in the history",
  "keyword": "Then "
});
formatter.match({
  "location": "CompraOnLineStepdefinitions.iSeeThePurchaseOrderInTheHistory()"
});
formatter.result({
  "status": "passed"
});
});