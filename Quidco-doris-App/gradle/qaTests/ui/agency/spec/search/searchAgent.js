'use strict';

var Login = require('../../lib/login');

describe('MA user searches his direct downline', function() {
    beforeEach(function() {
        Login.loginToManager('AA0101', 'pass1234');
    });

    it('should search his direct downline by status', function() {
        browser.setLocation('agency-management/downline');

        $('.select2-choice.ui-select-match').click();
        $('.ui-select-container li.ui-select-choices-row:nth-child(2)').click();
        browser.findElement(by.id('submit')).click();

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(1);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('AA010101');
                expect(cells[4].getText()).toBe('ACTIVE');
                expect(cells[9].getText()).toBe('01/01/2015 00:00:00');
            });
        });
    });

    it('should search his direct downline by username', function() {
        browser.setLocation('agency-management/downline');

        var username = browser.findElement(by.id('username'));
        username.sendKeys("AA01");

        var submit = browser.findElement(by.id('submit'));
        submit.click();

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(1);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('AA010101');
                expect(cells[4].getText()).toBe('ACTIVE');
                expect(cells[9].getText()).toBe('01/01/2015 00:00:00');
            });
        });

    });
});
