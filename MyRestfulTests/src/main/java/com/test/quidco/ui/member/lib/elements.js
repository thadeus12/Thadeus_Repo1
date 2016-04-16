'use strict';

var Elements = {
    'typeIn': function(css, value) {
        var e = element(by.css(css));
        e.clear();
        e.sendKeys(value);
    },

    'clickOn': function(css) {
        element(by.css(css)).click();
    },

    'clickOnText': function(text) {
        element(by.linkText(text)).click();
    }
};

module.exports = Elements;
