'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('Should throw errors for', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('invalid basic details', function () {
        browser.setLocation('agency-management/downline/create');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(4);

                elements[0].sendKeys('A');
                elements[1].sendKeys('A');
                elements[2].sendKeys('0');
                elements[3].sendKeys('1');
            });
        Forms.typeValueByCSS('.qa-firstname', "Bill");
        Forms.typeValueByCSS('.qa-lastname', "Clinton");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "+1424 763 4567");

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
        //browser.pause();
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

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                elements[0].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Username already exists");
                elements[1].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Username already exists");
                elements[2].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Username already exists");
                elements[3].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Username already exists");
            });
        //browser.pause();
       // element(by.css(".qa-password")).click();

    });
    it('invalid credit limits', function () {
        browser.setLocation('agency-management/downline/create/AM01/MA/');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(2);

                elements[0].sendKeys('4');
                elements[1].sendKeys('0');
            });
        Forms.typeValueByCSS('.qa-firstname', "Test");
        Forms.typeValueByCSS('.qa-lastname', "SMA");
        Forms.typeValueByCSS('.qa-password', "pass1234");
        Forms.typeValueByCSS('.qa-password-verify', "pass1234");
        Forms.typeValueByCSS('.qa-contactnumber', "99114");

        Forms.typeValueByCSS('.qa-creditlimit', "5000000");
        Forms.typeValueByCSS('.qa-maxagentcredit', "4000000");
        Forms.typeValueByCSS('.qa-maxmembercredit', "3000000");


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
        element(by.css(".qa-creditlimit")).click();
        expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Credit limit cannot be greater than the MA Max Credit set by upline.");
        element(by.css(".qa-maxagentcredit")).click();
        expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Credit limit cannot be greater than the upline available credit limit.");
        element(by.css(".qa-maxmembercredit")).click();
        expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Member Max Credit cannot be greater than the Member Max Credit set by upline.");
        //browser.pause();
    });
});