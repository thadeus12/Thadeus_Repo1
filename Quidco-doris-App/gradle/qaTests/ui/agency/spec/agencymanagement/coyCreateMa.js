'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should create MA', function () {
        browser.setLocation('agency-management/downline/create/IT01/MA/');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(2);

                elements[0].sendKeys('0');
                elements[1].sendKeys('1');
            });
        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "MA");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "400000");
        Forms.typeValueByCSS('.qa-maxagentcredit', "300000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "200000");


        element.all(by.css(".qa-maxAllowableMemberComm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('7');
                elements[1].sendKeys('7');
                elements[2].sendKeys('7');

            });
        element.all(by.css(".qa-memberCommission"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('6');
                elements[1].sendKeys('6');
                elements[2].sendKeys('6');

            });
        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('20');
                elements[1].sendKeys('20');
                elements[2].sendKeys('20');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('200');
                elements[1].sendKeys('200');
                elements[2].sendKeys('200');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('2000');
                elements[1].sendKeys('2000');
                elements[2].sendKeys('2000');

            });
        element.all(by.css(".qa-parentPosition "))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('10');
                elements[1].sendKeys('10');
                elements[2].sendKeys('10');

            });
        element.all(by.css(".qa-maxDownLinePosition"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('50');
                elements[1].sendKeys('50');
                elements[2].sendKeys('50');

            });
        Forms.clickByCss(".qa-submit-button");
        //browser.pause();
    });
});