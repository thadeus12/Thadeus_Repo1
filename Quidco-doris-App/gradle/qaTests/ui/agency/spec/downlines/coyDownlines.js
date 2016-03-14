'use strict';

var Login = require('../../lib/login');

describe('COY user ', function() {
    beforeEach(function() {
        Login.loginToBackoffice('admin.user', 'pass1234');
    });

    it('should list SMA', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(12);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('AA01');
                expect(cells[4].getText()).toBe('ACTIVE');
                expect(cells[5].getText()).toBe('0.00');
                expect(cells[6].getText()).toBe('10,000.00');
                expect(cells[7].getText()).toBe('50,000.00');
                expect(cells[8].getText()).toBe('01/01/2015 00:00:00');
            });

            rows[10].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('11');
                expect(cells[1].getText()).toBe('AA03');
                expect(cells[4].getText()).toBe('CLOSED');
            });

            rows[0].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBe(0);
            });

            rows[10].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBeGreaterThan(0);
            });
        });
    });

    it('should drill down through the SMA downlines', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            expect(links.length).toBe(12);
            expect(links[0].getText()).toBe('AA01');
            links[0].click();

            element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                expect(links.length).toBe(4);
                expect(links[0].getText()).toBe('AA0101');
                links[2].click();

                element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                    expect(links.length).toBe(1);
                    expect(links[0].getText()).toBe('AA010401');
                    links[0].click();

                    element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                        expect(links.length).toBe(0);
                    });
                });
            });
        });

        browser.setLocation('agency-management/downline/AA01/');
        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            links[0].click();
            element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                links[0].click();

                element(gridElement).all(by.css('.qa-username-link')).then(function (links) {
                    expect(links.length).toBe(0);
                });

                element(gridElement).all(by.css('.qa-username-span')).then(function (spans) {
                    expect(spans.length).toBe(7);
                    expect(spans[0].getText()).toBe('aa01.m01');
                });
            });

        });
    });

    it('should see breadcrumbs updating', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(1);
        });

        browser.setLocation('agency-management/downline/AA01/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(2);
        });

        browser.setLocation('agency-management/downline/AA01/AA0101/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(3);
            items[1].click();
            expect(browser.getCurrentUrl()).toBe('http://localhost:8000/company.html#/agency-management/downline/AA01/');
        });

        browser.setLocation('agency-management/downline/AA01/AA0101/AA010101/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(4);
            items[0].click();
            expect(browser.getCurrentUrl()).toBe('http://localhost:8000/company.html#/agency-management/downline');
        });
    });
});

describe('COY SubUser', function() {
    beforeEach(function() {
        Login.loginToBackoffice('user.01', 'pass1234');
    });

    it('should list SMA', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        expect(browser.driver.isElementPresent(gridElement)).toBeTruthy();

        element(gridElement).all(by.css('.ui-grid-row')).then(function(rows) {
            expect(rows.length).toBe(12);

            rows[0].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('1');
                expect(cells[1].getText()).toBe('AA01');
                expect(cells[4].getText()).toBe('ACTIVE');
                expect(cells[5].getText()).toBe('0.00');
                expect(cells[6].getText()).toBe('10,000.00');
                expect(cells[7].getText()).toBe('50,000.00');
                expect(cells[8].getText()).toBe('01/01/2015 00:00:00');
            });

            rows[10].all(by.css('.ui-grid-cell-contents')).then(function(cells) {
                expect(cells[0].getText()).toBe('11');
                expect(cells[1].getText()).toBe('AA03');
                expect(cells[4].getText()).toBe('CLOSED');
            });

            rows[0].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBe(0);
            });

            rows[10].all(by.css('.ui-grid-cell.-closed')).then(function(cells) {
                expect(cells.length).toBeGreaterThan(0);
            });
        });
    });

    it('should drill down through the SMA list', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            expect(links.length).toBe(12);
            expect(links[0].getText()).toBe('AA01');
            links[0].click();

            element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                expect(links.length).toBe(4);
                expect(links[0].getText()).toBe('AA0101');
                links[2].click();

                element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                    expect(links.length).toBe(1);
                    expect(links[0].getText()).toBe('AA010401');
                    links[0].click();

                    element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                        expect(links.length).toBe(0);
                    });
                });
            });
        });

        browser.setLocation('agency-management/downline/AA01/');
        element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
            links[0].click();
            element(gridElement).all(by.css('.qa-username-link')).then(function(links) {
                links[0].click();

                element(gridElement).all(by.css('.qa-username-link')).then(function (links) {
                    expect(links.length).toBe(0);
                });

                element(gridElement).all(by.css('.qa-username-span')).then(function (spans) {
                    expect(spans.length).toBe(7);
                    expect(spans[0].getText()).toBe('aa01.m01');
                });
            });

        });
    });

    it('should see breadcrumbs updating', function() {
        browser.setLocation('agency-management/downline');

        var gridElement = by.css('.grid.ui-grid');

        browser.wait(function() {
            return browser.driver.isElementPresent(gridElement);
        }, 5000);

        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(1);
        });

        browser.setLocation('agency-management/downline/AA01/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(2);
        });

        browser.setLocation('agency-management/downline/AA01/AA0101/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(3);
            items[1].click();
            expect(browser.getCurrentUrl()).toBe('http://localhost:8000/company.html#/agency-management/downline/AA01/');
        });

        browser.setLocation('agency-management/downline/AA01/AA0101/AA010101/');
        element.all(by.css('.qa-breadcrumb')).then(function(items) {
            expect(items.length).toBe(4);
            items[0].click();
            expect(browser.getCurrentUrl()).toBe('http://localhost:8000/company.html#/agency-management/downline');
        });
    });
});
