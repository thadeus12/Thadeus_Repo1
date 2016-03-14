'use strict';

var pages = require('../../lib/pages');

require('../../lib/pages/login');
require('../../lib/pages/index');

describe('Member site layout', function () {
    beforeEach(function () {
        pages.init(browser);
        pages.login.login('AA010101M01', 'pass1234');
    });

    it('should have all the required expect(browser.isElementPresent(s', function() {
        pages.index.navigate();

        expect(browser.isElementPresent(by.css('.body'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('header.header'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('footer'))).toBeTruthy();

        expect(browser.isElementPresent(by.css('div.content'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('aside.menu'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('div.account-overview'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('div.bet-manager'))).toBeTruthy();

        expect(browser.isElementPresent(by.css('ul.tabs'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('div.betslip'))).toBeTruthy();
        expect(browser.isElementPresent(by.css('div.unmatched-bets'))).toBeTruthy();
    });
});
