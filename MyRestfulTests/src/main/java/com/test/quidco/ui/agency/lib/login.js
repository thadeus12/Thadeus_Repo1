'use strict';

var Forms = require('./forms');
var width = 1800;
var height = 1200;

module.exports = {
    'loginToBackoffice': function(username, password) {
        browser.driver.manage().window().setSize(width, height);
        browser.get('/company.html');
        Forms.typeValueById('username', username);
        Forms.typeValueById('password', password);
        Forms.clickById('submit');
    },

    'loginToManager': function(username, password) {
        browser.driver.manage().window().setSize(width, height);
        browser.get('/agency.html');
        Forms.typeValueById('username', username);
        Forms.typeValueById('password', password);
        Forms.typeValueById('captcha', 1111);
        Forms.clickById('submit');
    }
};
