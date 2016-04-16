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

    it('should display contents of favorites', function() {
        pages.index.navigate();

        pages.index.navigateMenu(['Sport', 'Cricket']);
        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
                elements[1].click();
            });

        pages.index.navigateMenu(['Sport', 'Football']);
        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
            });

        pages.index.navigateMenu(['Sport', 'Tennis']);
        element
            .all(by.css(".qa-matches"))
            .then(function(elements) {
                elements[0].click();
            });

        expect(element.all(by.css('.qa-favorites')).getText()).toBe('Favorites(4)');

        //navigate to favorites page
        pages.index.navigateMenu(['Favorites']);
        expect(browser.isElementPresent(by.css('.body'))).toBeTruthy();

        element(by.css('cricket-section')).then(function(fields) {
            expect(fields(by.css('section-title'))).getText().toBe("Cricket");
            fields(by.css('event-title'));

            /*rows[0].all(by.css('section-contents')).then(function (cells) {
 
            });*/
        });
    });
});
