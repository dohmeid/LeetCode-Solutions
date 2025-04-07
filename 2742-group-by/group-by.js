/**
 * @param {Function} fn
 * @return {Object}
 */

//method1: using reduce
Array.prototype.groupBy = function (fn) {

    const res = this.reduce((arr, element) => {
        const key = fn(element);
        if (!(key in arr))
            arr[key] = [];
        arr[key].push(element);
        return arr;
    }, {});

    return res;
};



//method2 : using loop
/* 
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
*/


/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */