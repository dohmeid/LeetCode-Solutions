/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {

    if (arr.length === 0)
        return [];

    if (size > arr.length)
        return [arr];

    //method1
    let result = [];
    for (let i = 0; i <arr.length; i+=size) {
        result.push(arr.slice(i,i+size));
    }
    return result;

    /* method2 - less efficiency

    let temp = [];
    let result = [];

    for (let item of arr) {
        temp.push(item);

        if (temp.length === size) {
            result.push(temp);
            temp = [];
        }
    }

    if (temp.length !== 0) {
        result.push(temp);
    }

    return result;
    */
};
