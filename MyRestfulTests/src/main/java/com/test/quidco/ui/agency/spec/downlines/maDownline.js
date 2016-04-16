'use strict';

var Login = require('../../lib/login');

describe('List MA Downlines', function() {
    beforeEach(function() {
        Login.loginToManager('AA0101', 'pass1234');
    });

    it('should list Agents', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(4);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('AA010101');
                expect(cells[4].getText()).toBe('ACTIVE');
                expect(cells[5].getText()).toBe('0.00');
                expect(cells[6].getText()).toBe('10,000.00');
                expect(cells[7].getText()).toBe('50,000.00');
                expect(cells[8].getText()).toBe('01/01/2015 00:00:00');
            });

            rows[3].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('4');
                expect(cells[1].getText()).toBe('AA010103');
                expect(cells[4].getText()).toBe('CLOSED');
            });

            rows[0].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBe(0);
            });

            rows[3].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBeGreaterThan(0);
            });
        });
    });
    it('should drill down through the Agent list', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            expect(links.length).toBe(4);
            expect(links[0].getText()).toBe('AA010101');
            links[0].click();

            element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                element(gridElement).all(by.css('.qa-username-span')).then(function (spans) {
                    expect(spans.length).toBe(7);
                    expect(spans[0].getText()).toBe('aa01.m01');
                });
            });
        });
    });

    it('should update breadcrumbs', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        browser.setLocation('agency-management/downline/AA010101');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(2);
            items[1].click();
            expect(browser.getCurrentUrl()).toBe('http://localhost:8000/agency.html#/agency-management/downline/AA010101/');
        });
    });
});
