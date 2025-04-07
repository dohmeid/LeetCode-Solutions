/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    let res = {};

    for (let i = 0; i < this.length; i++) {
        const key = fn(this[i]);

        if (!(key in res))
            res[key] = [];

        res[key].push(this[i]);
    }

    return res;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */