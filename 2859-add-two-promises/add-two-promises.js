/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
    let sum = 0;
    /*promise1
        .then(response => {
            console.log(response); // Runs if resolved
            sum += response;
            return promise2;
        })
        .then(response => {
            console.log(response); // Runs if resolved
            sum += response;
            return sum;
        });*/

    await Promise.all([promise1, promise2]).then(results => {
        console.log("Results:", results); // ["Result 1", "Result 2"]
        sum = sum + results[0] + results[1];
    });
    return sum;

};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */