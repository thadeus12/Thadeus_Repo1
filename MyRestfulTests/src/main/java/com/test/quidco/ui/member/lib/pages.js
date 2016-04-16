'use strict';

var Pages = {
    'init': function(browser) {
        this.browser = browser;
        this.browser.get('/index.html');
        this.browser.waitForAngular();
    }
};

module.exports = Pages;
