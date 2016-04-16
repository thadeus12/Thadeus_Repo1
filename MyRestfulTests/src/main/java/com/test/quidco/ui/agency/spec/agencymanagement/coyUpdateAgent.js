/* 'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

ddescribe('COY user', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should update Agent', function () {
        browser.setLocation('agency-management/downline/MM01/MM0101/');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element.all(by.css(".qa-editpen"))
            .then(function(elements) {
                elements[0].click();
            });
        browser.wait(function() {
            return browser.driver.isElementPresent(by.css(".ngdialog"));
        }, 5000);

        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "Agent");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "200000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "100000");

        //browser.pause();
        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('200');
                elements[1].sendKeys('200');
                elements[2].sendKeys('200');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('300');
                elements[1].sendKeys('300');
                elements[2].sendKeys('300');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('3000');
                elements[1].sendKeys('3000');
                elements[2].sendKeys('3000');

            });
        element.all(by.css(".qa-maxDownLinePosition"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('30');
                elements[1].sendKeys('30');
                elements[2].sendKeys('30');

            });
        Forms.clickByCss(".qa-submit-button");
        browser.pause();
    });
});
    */