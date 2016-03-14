'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user ', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should create SMA', function () {
        browser.setLocation('agency-management/downline/create');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(4);

                elements[0].sendKeys('I');
                elements[1].sendKeys('T');
                elements[2].sendKeys('0');
                elements[3].sendKeys('1');
            });
        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "SMA");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "500000");
        Forms.typeValueByCSS('.qa-maxagentcredit', "400000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "300000");


        element.all(by.css(".qa-maxAllowableMemberComm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('8');
                elements[1].sendKeys('8');
                elements[2].sendKeys('8');

             });
        element.all(by.css(".qa-memberCommission"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('7');
                elements[1].sendKeys('7');
                elements[2].sendKeys('7');

            });
        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('10');
                elements[1].sendKeys('10');
                elements[2].sendKeys('10');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('100');
                elements[1].sendKeys('100');
                elements[2].sendKeys('100');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('1000');
                elements[1].sendKeys('1000');
                elements[2].sendKeys('1000');

            });
        element.all(by.css(".qa-maxDownLinePosition"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('60');
                elements[1].sendKeys('60');
                elements[2].sendKeys('60');

            });
        Forms.clickByCss(".qa-submit-button");
        //browser.pause();
    });
});