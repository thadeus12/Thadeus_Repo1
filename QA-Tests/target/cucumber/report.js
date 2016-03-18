$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testFeatures/HomePageLinks.feature");
formatter.feature({
  "line": 2,
  "name": "checking broken links",
  "description": "",
  "id": "checking-broken-links",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Validate mode page tabs",
  "description": "",
  "id": "checking-broken-links;validate-mode-page-tabs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Mode tab on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The tabs listed below should be displayed",
  "rows": [
    {
      "cells": [
        "Tabs"
      ],
      "line": 8
    },
    {
      "cells": [
        "Femmes enceintes"
      ],
      "line": 9
    },
    {
      "cells": [
        "Bébé"
      ],
      "line": 10
    },
    {
      "cells": [
        "Sacs \u0026 bagages"
      ],
      "line": 11
    },
    {
      "cells": [
        "Lunettes de soleil"
      ],
      "line": 12
    },
    {
      "cells": [
        "Montres \u0026 Bijoux"
      ],
      "line": 13
    },
    {
      "cells": [
        "Chaussures"
      ],
      "line": 14
    },
    {
      "cells": [
        "Enfant"
      ],
      "line": 15
    },
    {
      "cells": [
        "Vêtements d\u0027occasion"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
