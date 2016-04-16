'use strict';

function Scenario() {
    this.steps = [];
}

Scenario.prototype = {
    'next': function(callback) {
        this.steps.push(callback);
        return this;
    },

    'run': function() {
        var i = -1,
            self = this;

        function done() {
            var callback;

            i++;
            if(i < self.steps.length) {
                callback = self.steps[i];

                if(callback.length > 0) {
                    self.steps[i].call(self, done);
                }
                else {
                    self.steps[i].call(self);
                    done();
                }
            }
        }

        done();
    }
};

module.exports = {
    'start': function() {
        return new Scenario();
    }
};
