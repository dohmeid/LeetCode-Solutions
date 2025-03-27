/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = (functions) => {
    
    //method1 - brute force solution
    /*return function(x) {
        let result = x;
        for(let i=functions.length-1; i>=0;i--){
            let fi = functions[i];
            result = fi(result);
        }
        return result;
    }*/

    //method2 - using reduceRight (traverse an array in reverse order)
    return function(x) {
       
       let result = functions.reduceRight((res,f)=>{
        return f(res);
       },x);
    
        return result;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */