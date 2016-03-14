'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('should throw validation error for', function() {
    beforeEach(function () {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('invalid bet settings', function () {
        browser.setLocation('agency-management/downline/create/AM01/MA/');

        element.all(by.css(".apl-code-input input[type='text']"))
            .then(function(elements) {
                expect(elements.length).toBe(2);

                elements[0].sendKeys('5');
                elements[1].sendKeys('0');
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

                elements[0].sendKeys('99');
                elements[1].sendKeys('99');
                elements[2].sendKeys('99');

            });
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('11000');
                elements[1].sendKeys('11000');
                elements[2].sendKeys('11000');

            });
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                expect(elements.length).toBe(3);

                elements[0].sendKeys('15000');
                elements[1].sendKeys('15000');
                elements[2].sendKeys('15000');

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

                elements[0].sendKeys('50');
                elements[1].sendKeys('50');
                elements[2].sendKeys('50');

            });
        Forms.clickByCss(".qa-submit-button");

        element.all(by.css(".qa-minBetMinimum"))
            .then(function(elements) {
                elements[0].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Min bet cannot be less than the min bet set by upline");
                elements[1].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Min bet cannot be less than the min bet set by upline");
                elements[2].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Min bet cannot be less than the min bet set by upline");
                browser.sleep(1000);
            });
        //browser.pause();
        element.all(by.css(".qa-maxBetMinimum"))
            .then(function(elements) {
                elements[0].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max bet cannot be greater than the max bet set by upline");
                elements[1].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max bet cannot be greater than the max bet set by upline");
                elements[2].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max bet cannot be greater than the max bet set by upline");
                browser.sleep(1000);
            });
        //browser.pause();
        element.all(by.css(".qa-mpmBetMinimumm"))
            .then(function(elements) {
                elements[0].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max per match cannot be greater than the max per match set by upline");
                elements[1].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max per match cannot be greater than the max per match set by upline");
                elements[2].click();
                expect( element(by.css("._720kb-tooltip-open")).getText()).toContain("Max per match cannot be greater than the max per match set by upline");
            });
        //browser.pause();
     });
});