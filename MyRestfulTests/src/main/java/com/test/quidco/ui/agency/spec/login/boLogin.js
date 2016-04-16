'use strict';

var Forms = require('../../lib/forms');

describe('Backoffice login page', function () {

    beforeEach(function () {
        browser.get('/company.html');
        browser.waitForAngular();
    });

    it('should display backoffice login page', function () {
        expect(browser.isElementPresent(by.css('.qa-backoffice-login-form'))).toBeTruthy();

        expect(element(by.css('.qa-backoffice-login-form .qa-username-label')).getText()).toEqual('Enter Username:');
        expect(element(by.css('.qa-backoffice-login-form .qa-password-label')).getText()).toEqual('Enter Password:');

        expect(browser.isElementPresent(by.css('.qa-backoffice-login-form input.qa-username-input[type="text"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-backoffice-login-form input.qa-password-input[type="password"]'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('.qa-backoffice-login-form input.qa-submit-button[type="submit"]'))).toBeTruthy();
    });

    it('should check for username presence', function() {
        var e = element(by.css('.qa-backoffice-login-form .error'));

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
        var e = element(by.css('.qa-backoffice-login-form .error'));

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

    it('should show login failed message', function() {
        var e = element(by.css('.qa-backoffice-login-form .error'));

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeFalsy();
        });

        Forms.typeValueById('username', '_wrong_stuff_');
        Forms.typeValueById('password', '_wrong_stuff_');
        Forms.clickById('submit');

        e.isDisplayed().then(function(isDisplayed) {
            expect(isDisplayed).toBeTruthy();
            expect(e.getText()).toContain('Login fail. Please try again');
        });
    });

    it('should login successfuly', function() {
        var e = element(by.css('.qa-backoffice-login-form .error'));

        Forms.typeValueById('username', 'admin.user');
        Forms.typeValueById('password', 'pass1234');
        Forms.clickById('submit');

        expect(browser.getCurrentUrl()).toBe('http://localhost:8000/company.html#/agency-management/downline');
    });
});
