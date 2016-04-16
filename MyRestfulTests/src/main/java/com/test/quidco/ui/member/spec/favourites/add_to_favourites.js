/**
 * Created by charles.moga on 24/02/2016.
 */
'use strict';

var pages = require('../../lib/pages'),
    //model = require('../../lib/model_favourites'),
    elements = require('../../lib/elements');

require('../../lib/pages/login');
require('../../lib/pages/index');

describe('', function () {
    beforeEach(function () {
        pages.init(browser);
        pages.login.login('AA010101M01', 'pass1234');
    });

    it('should place cricket matches to favorites', function() {
        pages.index.navigate();
        pages.index.navigateMenu(['Sport', 'Cricket']);

        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
                elements[1].click();
            });

        expect(element.all(by.css('.qa-favorites')).getText()).toBe('Favorites(2)');
    });

    it('should place football match to favorites', function() {
        pages.index.navigate();
        pages.index.navigateMenu(['Sport', 'Football']);

        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
             });

        expect(element.all(by.css('.qa-favorites')).getText()).toBe('Favorites(3)');
    });

    it('should place tennis match to favorites', function() {
        pages.index.navigate();
        pages.index.navigateMenu(['Sport', 'Tennis']);

        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
            });

        expect(element.all(by.css('.qa-favorites')).getText()).toBe('Favorites(4)');
    });
});
