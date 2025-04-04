/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    
    //method1 - convert to JSON string and check length less than 2 - {} - the 2 for open+close braces
    if(JSON.stringify(obj).length<=2)
        return true;

    //method2 - check the keys of the object
    //if(Object.keys(obj).length===0)
      //  return true;
    return false;
};