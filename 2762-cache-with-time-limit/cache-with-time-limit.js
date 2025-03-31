var TimeLimitedCache = function () {
    this.mymap = new Map();
    //key, { val: 2, time: 30 }
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */

TimeLimitedCache.prototype.set = function (key, value, duration) {

    const timeoutID = setTimeout(() => {
        if (this.mymap.size > 0 && this.mymap.get(key).time <= duration)
            this.mymap.delete(key);
    }, duration);

    if (this.mymap.has(key)) {
        clearTimeout(this.mymap.get(key).time);
        this.mymap.set(key, { val: value, time: timeoutID });
        return true;
    }
    else {

        this.mymap.set(key, { val: value, time: timeoutID });
        return false;
    }

};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function (key) {
    if (this.mymap.has(key))
        return this.mymap.get(key).val;
    else
        return -1;

};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function () {
    return this.mymap.size;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */