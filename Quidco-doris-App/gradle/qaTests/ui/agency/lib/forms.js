'use strict';

module.exports = {
    'typeValueById': function(elementId, value) {
        var e = element(by.id(elementId));
        e.clear();
        e.sendKeys(value);
    },

    'typeValueByCSS': function(css, value) {
        var e = element(by.css(css));
        e.clear();
        e.sendKeys(value);
    },

    'clickById': function(elementId) {
        element(by.id(elementId)).click();
    },
    'clickByCss': function(css) {
        element(by.css(css)).click();
    }
};
