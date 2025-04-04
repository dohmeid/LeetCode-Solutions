/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function (obj) {

    /*method1 - convert to JSON string and check length less than 2 - {} - the 2 for open+close braces
    return JSON.stringify(obj).length<=2;
    */

    /*method2 - check the keys of the object
    return Object.keys(obj).length===0;
    */

    //method3 - check if the obj can enter a loop (aka it's not empty)
    for (let key in obj)
        return false;
    return true;
};