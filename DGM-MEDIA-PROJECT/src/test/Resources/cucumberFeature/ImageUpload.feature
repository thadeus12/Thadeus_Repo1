@smoke-test
Feature: Testing image Upload to http://www.imageupload.co.uk/

  Scenario: Image Upload

    Given I am on the image upload page
    When I click on the start uploading button
    And I enter the location of the file
    Then The image upload overlay should be displayed
    When I click on upload button
    Then The image upload progress should be started
    Then I should see upload completion success page


