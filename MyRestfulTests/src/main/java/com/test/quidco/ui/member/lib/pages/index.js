'use strict';

var pages = require('./../pages'),
    elements = require('./../elements');

pages.index = {
    'navigate': function() {
        pages.browser.setLocation('');
    },

    'navigateMenu': function(labels) {
        for(var i = 0; i < labels.length; i++) {
            elements.clickOnText(labels[i]);
        }
    }
};
