'use strict';

var Login = require('../../lib/login');
var Forms = require('../../lib/forms');

describe('COY user', function() {
    beforeEach(function () {
        Login.loginToManager('SM03', 'pass1234');
    });

    it('should make transfer through a popup', function() {
        browser.setLocation('agency-management/transfer');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(3);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('SM0301');
                expect(cells[2].getText()).toBe('-2,000.00');
                expect(cells[3].getText()).toBe('0.00');
                expect(cells[4].getText()).toBe('500,000.00');

                cells[5].all(by.css('a')).then(function(links) {
                    expect(links.length).toBe(1);
                    links[0].click();
                });
            });
        });

        browser.sleep(2000);

        element(by.css('.qa-transferamount')).getAttribute('value').then(function(value) {
            expect(value).toBe('2000');
            Forms.typeValueByCSS('.qa-transferamount', 1000);
            Forms.clickByCss('.qa-submit-button');
            browser.sleep(2000);
            browser.switchTo().alert().accept();
        });

        browser.sleep(2000);

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[2].getText()).toBe('-1,000.00');
            });
        });
    });
});
