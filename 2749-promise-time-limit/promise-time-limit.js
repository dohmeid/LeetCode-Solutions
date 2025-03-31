/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function (fn, t) {

    //method1
    /*
    return async function (...args) {
        const myPromise = new Promise((resolve, reject) => {

            const timeoutID = setTimeout(() => reject("Time Limit Exceeded"), t);

            fn(...args)
                .then((result) => {
                    resolve(result);
                })
                .catch((error) => {
                    reject(error);
                })
                .finally(() => {
                    clearTimeout(timeoutID);
                });
        });
        return myPromise;
    }
    */

    //method2
    return async function (...args) {
        const rejectedPromise = new Promise((resolve, reject) => {
            setTimeout(() => reject("Time Limit Exceeded"), t);
        });
        const fnPromise = fn(...args);
        return Promise.race([fnPromise, rejectedPromise]);
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */