/**
 * @param {Function} fn
 * @return {Function}
 */
const memoize = (fn) => {

    //create a Map that saves the function with its arguments and the returned result
    const cache = new Map();

    return function (...args) {
        //convert the args to json objects to save them as map element key
        const key = JSON.stringify(args);

        //if same args, return the cached result
        if (cache.has(key))
            return cache.get(key);

        //else, call the function and cache the result
        const result = fn(...args);
        cache.set(key, result);
        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */