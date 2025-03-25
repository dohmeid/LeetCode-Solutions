/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {

    ///method1 - using reduce
    let filteredArr = arr.reduce((result,value,i)=>{ 
        
        if(fn(value,i))
            result.push(value);
        return result;
        
        },[]);
    return filteredArr;


    /*  method2
    let filteredArr = [];

    for(var i=0;i<arr.length;i++){
        if(fn(arr[i],i))
            filteredArr.push(arr[i]);
    }

    return filteredArr;*/
};