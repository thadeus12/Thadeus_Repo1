'use strict';

var Login = require('../../lib/login');

describe('List Agent Downlines', function() {
    beforeEach(function() {
        Login.loginToManager('AA010101', 'pass1234');
    });

    it('should list Members', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            element(gridElement).all(by.css('.qa-username-span')).then(function (spans) {
                expect(spans.length).toBe(7);
                expect(spans[0].getText()).toBe('aa01.m01');
                expect(spans[6].getText()).toBe('AA010101M06');
            });
        });
    });
});
