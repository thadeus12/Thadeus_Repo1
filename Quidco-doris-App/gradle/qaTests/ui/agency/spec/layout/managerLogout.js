'use strict';

var Login = require('../../lib/login');

describe('Manager Logout link', function() {
    beforeEach(function() {
        Login.loginToManager('AA01', 'pass1234');
    });

    it('should log out the user', function() {
        var e = by.css('.qa-login-link');

        browser.setLocation('downline');
        expect(browser.driver.isElementPresent(e)).toBeTruthy();

        element(e).click();
        expect(browser.getCurrentUrl()).toBe('http://localhost:8000/agency.html#');
        expect(browser.isElementPresent(by.css('.qa-manager-login-form'))).toBeTruthy();
    });
});
