'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user ', function() {
    beforeEach(function () {
        Login.loginToManager('IT01', 'pass1234');
    });

    it('should update SMA', function () {
        browser.setLocation('agency-management/downline');
        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element.all(by.css(".qa-editpen"))
            .then(function(elements) {
                elements[0].click();
            });
        //browser.pause();
        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "MA1");
        //Forms.typeValueByCSS('.qa-password', "pass1234");
        //Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "300000");
        Forms.typeValueByCSS('.qa-maxagentcredit', "200000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "100000");


        //element.all(by.css(".qa-maxAllowableMemberComm"))
        //    .then(function(elements) {
        //        expect(elements.length).toBe(3);
        //        elements[0].clear();
        //        elements[1].clear();
        //        elements[2].clear();
        //
        //        elements[0].sendKeys('6');
        //        elements[1].sendKeys('6');
        //        elements[2].sendKeys('6');
        //
        //    });
        //element.all(by.css(".qa-memberCommission"))
        //    .then(function(elements) {
        //        expect(elements.length).toBe(3);
        //        elements[0].clear();
        //        elements[1].clear();
        //        elements[2].clear();
        //
        //        elements[0].sendKeys('5');
        //        elements[1].sendKeys('5');
        //        elements[2].sendKeys('5');
        //
        //    });
        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('15');
                elements[1].sendKeys('15');
                elements[2].sendKeys('15');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('150');
                elements[1].sendKeys('150');
                elements[2].sendKeys('150');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('1500');
                elements[1].sendKeys('1500');
                elements[2].sendKeys('1500');

            });
        element.all(by.css(".qa-parentPosition "))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('9');
                elements[1].sendKeys('9');
                elements[2].sendKeys('9');

            });
        element.all(by.css(".qa-maxDownLinePosition"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('51');
                elements[1].sendKeys('51');
                elements[2].sendKeys('51');

            });
        Forms.clickByCss(".qa-submit-button");
    });
});