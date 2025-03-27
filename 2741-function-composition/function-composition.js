/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = (functions) => {
    
    //method1 - brute force solution
    return function(x) {
        for(let i=functions.length-1; i>=0;i--){
            let fi = functions[i];
            x = fi(x);
        }
        return x;
        
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */