@smoke-test
Feature: checking broken links
Scenario: Validate mode page tabs
  Given I go to "http://www.shoop.fr/"
  When I click on Mode tab on the home page
  Then The tabs listed below should be displayed

| Tabs                |
|Femmes enceintes     |
|Bébé                 |
|Sacs & bagages       |
|Lunettes de soleil   |
|Montres & Bijoux     |
|Chaussures           |
|Enfant               |
|Vêtements d'occasion |