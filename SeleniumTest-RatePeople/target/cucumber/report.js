$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("displayedNumbers.feature");
formatter.feature({
  "line": 3,
  "name": "Ordered Number Test",
  "description": "",
  "id": "ordered-number-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@complete"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Display Numbers in ascending order",
  "description": "",
  "id": "ordered-number-test;display-numbers-in-ascending-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The Ordered Number Test File renders",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "The order button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The Numbers rendered under the order button should be displayed in ascending order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});