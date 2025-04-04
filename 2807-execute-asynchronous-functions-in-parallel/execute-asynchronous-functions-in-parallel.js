/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function (functions) {
    let results = new Array(functions.length); //we need the index to preserve the order of the function's results
    let resolvedCounter = 0;

    const fPromise = new Promise((resolve, reject) => {
        if (functions.length === 0)
            return resolve([]);

        for (let i = 0; i < functions.length; i++) {

            functions[i]().
                then((result) => {
                    resolvedCounter++;
                    results[i] = result;

                    if (resolvedCounter === functions.length) {
                        return resolve(results);
                    }
                })
                .catch((error) => {
                    return reject(error); //return reject on the first rejected function
                });
        }


    });

    return fPromise;
};

/*
Promise.all() usually does this but it's not permitted in this question
    return Promise.all(functions)
        .then((result)=>result)
        .catch((error)=>console.log("an error happened in one of the promises"));
*/

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */