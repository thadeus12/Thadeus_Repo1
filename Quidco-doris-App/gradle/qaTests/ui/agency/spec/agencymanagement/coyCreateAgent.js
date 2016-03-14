'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should create Agent', function () {
        browser.setLocation('agency-management/downline/create/MM0101/Agent/');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(2);
                elements[0].sendKeys('4');
                elements[1].sendKeys('1');
            });
        //browser.pause();
        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "Agent");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "400000");
        //Forms.typeValueByCSS('.qa-maxagentcredit', "300000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "200000");

        //browser.pause();
        element.all(by.css(".qa-maxAllowableMemberComm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('5');
                elements[1].sendKeys('5');
                elements[2].sendKeys('5');

            });
        element.all(by.css(".qa-memberCommission"))
            .then(function(elements) {
                expect(elements.length).toBe(3);
                elements[0].clear();
                elements[1].clear();
                elements[2].clear();

                elements[0].sendKeys('4');
                elements[1].sendKeys('4');
                elements[2].sendKeys('4');

            });
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
        element.all(by.css(".qa-parentPosition"))
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

                elements[0].sendKeys('30');
                elements[1].sendKeys('30');
                elements[2].sendKeys('30');

            });
        Forms.clickByCss(".qa-submit-button");
        //browser.pause();
    });
});