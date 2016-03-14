'use strict';

var Forms = require('../../lib/forms');

describe('Manager site login', function () {

    beforeEach(function () {
        browser.get('/agency.html');
        browser.waitForAngular();
    });

    it('should display manager login page', function () {
        expect(browser.isElementPresent(by.css('.qa-manager-login-form'))).toBeTruthy();

        expect(element(by.css('.qa-manager-login-form .qa-username-label')).getText()).toEqual('Enter Username:');
        expect(element(by.css('.qa-manager-login-form .qa-password-label')).getText()).toEqual('Enter Password:');
        expect(element(by.css('.qa-manager-login-form .qa-captcha-label')).getText()).toEqual('Enter CAPTCHA:');
        expect(element(by.css('.qa-manager-login-form .qa-browsers-label')).getText()).toEqual('Best Viewed In:');

        expect(browser.isElementPresent(by.css('.qa-manager-login-form img.captcha-image'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form input.captcha-reload[type="button"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form input.qa-captcha-input[type="text"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form input.qa-username-input[type="text"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form input.qa-password-input[type="password"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form input.qa-submit-button[type="submit"]'))).toBeTruthy();

        expect(browser.isElementPresent(by.css('.qa-manager-login-form .icon.firefox'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form .icon.ie'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-manager-login-form .icon.chrome'))).toBeTruthy();
    });

    it('should check for username presence', function() {
        var e = element(by.css('.qa-manager-login-form .error'));

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeFalsy();
        });

        Forms.clickById('submit');

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeTruthy();
            expect(e.getText()).toContain('Username is required');
        });
    });

    it('should check for password presence', function() {
        var e = element(by.css('.qa-manager-login-form .error'));

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeFalsy();
        });

        Forms.typeValueById('username', '_wrong_stuff_');
        Forms.clickById('submit');

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeTruthy();
            expect(e.getText()).toContain('Password is required');
        });
    });

    it('should check for captcha presence', function() {
        var e = element(by.css('.qa-manager-login-form .error'));

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeFalsy();
        });

        Forms.typeValueById('username', '_wrong_stuff_');
        Forms.typeValueById('password', '_wrong_stuff_');
        Forms.clickById('submit');

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeTruthy();
            expect(e.getText()).toContain('Captcha is required');
        });
    });

    it('should show login failed message', function() {
        var e = element(by.css('.qa-manager-login-form .error'));

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeFalsy();
        });

        Forms.typeValueById('username', '_wrong_stuff_');
        Forms.typeValueById('password', '_wrong_stuff_');
        Forms.typeValueById('captcha', '1111');
        Forms.clickById('submit');

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeTruthy();
            expect(e.getText()).toContain('Login fail. Please try again');
        });
    });

    it('should login successfuly', function() {
        var e = element(by.css('.qa-manager-login-form .error'));

        Forms.typeValueById('username', 'AA01');
        Forms.typeValueById('password', 'pass1234');
        Forms.typeValueById('captcha', '1111');
        Forms.clickById('submit');

        expect(browser.getCurrentUrl()).toBe('http://localhost:8000/agency.html#/account/balance');
    });
});
