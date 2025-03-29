/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {

    //wait for both promise1 and promise2 to resolve
    const results =  await Promise.all([promise1, promise2])
    return results[0]+results[1];

    /*
    let sum = 0;
    await Promise.all([promise1, promise2]).then(results => {
        sum += results[0] + results[1];
    });
    return sum;
    */
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */