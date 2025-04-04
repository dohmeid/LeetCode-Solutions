/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function (fn, t) {
    let id;
    return function (...args) {
        clearTimeout(id);
        id = setTimeout(() => fn(...args), t);

        /*
        note
        doing this ->  id = setTimeout(fn(...args),t); won't work since the function is invoked directly and its return value is passed to the timeout function

        we need to use the array function to delay the execution.
        */
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */