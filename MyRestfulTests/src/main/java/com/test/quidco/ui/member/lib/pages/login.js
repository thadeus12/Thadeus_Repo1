'use strict';

var pages    = require('./../pages'),
    elements = require('./../elements');

pages.login = {
    'navigate': function() {
        pages.browser.setLocation('');
    },

    'login': function(user, pass) {
        elements.typeIn('.input-username', user);
        elements.typeIn('.input-password', pass);
        elements.typeIn('.input-captcha', '1111');
        elements.clickOn('.button-login');
    }
};
