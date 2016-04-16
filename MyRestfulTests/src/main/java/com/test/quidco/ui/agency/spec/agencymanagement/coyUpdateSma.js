'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user ', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should update SMA', function () {
        browser.setLocation('agency-management/downline');
        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element.all(by.css(".qa-editpen"))
            .then(function(elements) {
                elements[4].click();
             });
        //browser.pause();
        Forms.typeValueByCSS('.qa-firstname', "Test1");
        Forms.typeValueByCSS('.qa-lastname', "SMA1");
        //Forms.typeValueByCSS('.qa-password', "pass1234");
        //Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "600000");
        Forms.typeValueByCSS('.qa-maxagentcredit', "500000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "400000");


        //no commission for now
        //element.all(by.css(".qa-maxAllowableMemberComm"))
        //    .then(function(elements) {
        //        expect(elements.length).toBe(3);
        //
        //        elements[0].sendKeys('7');
        //        elements[1].sendKeys('7');
        //        elements[2].sendKeys('7');
        //
        //    });

        //element.all(by.css(".qa-memberCommission"))
        //    .then(function(elements) {
        //        expect(elements.length).toBe(3);
        //
        //        elements[0].sendKeys('6');
        //        elements[1].sendKeys('6');
        //        elements[2].sendKeys('6');
        //
        //    });
        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('9');
                elements[1].sendKeys('9');
                elements[2].sendKeys('9');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('99');
                elements[1].sendKeys('99');
                elements[2].sendKeys('99');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('999');
                elements[1].sendKeys('999');
                elements[2].sendKeys('999');

            });
        element.all(by.css(".qa-maxDownLinePosition"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('70');
                elements[1].sendKeys('70');
                elements[2].sendKeys('70');

            });
        Forms.clickByCss(".qa-submit-button");
     });
});