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

    let temp = [];
    let count = 0;
    let result=[];

    for (let item of arr) {
        temp.push(item);
        count++;

        if(count===size){
            result.push(temp);
            count=0;
            temp=[];
        }
    }

    if(count!==0){
         result.push(temp);
    }

    return result;
};
