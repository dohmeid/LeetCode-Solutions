/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */

//note: this is a faster solution using Maps
var join = function (arr1, arr2) {
    let map = new Map();

    for (let obj of arr1) {
        map.set(obj.id, { ...obj });
    }

    for (let obj of arr2) {
        if (map.has(obj.id)) {
            const oldObj = map.get(obj.id);
            const newObj = {...oldObj,...obj}
            map.set(obj.id, { ...newObj })
        }
        else
            map.set(obj.id, { ...obj });
    }

    const joinedArray = [...map.values()];
    return joinedArray.sort((a, b) => (a.id - b.id));
};


/* note: this solution gives works but gives time limit exceeded since we're excessively searching for the array element
var join = function (arr1, arr2) {
   let joinedArray = [...arr1];
   
   for (let i = 0; i < arr2.length; i++) {
       const index = joinedArray.findIndex(obj => obj.id === arr2[i].id);
       if (index!==-1) {
           //merge using spread operator , arr2[i] overrides oldObject
           const oldIDObject = joinedArray[index];
           joinedArray[index] = {...oldIDObject,...arr2[i]};
       }
       else {
           joinedArray.push(arr2[i]);
       }
   }
   return joinedArray.sort((a, b) => (a.id - b.id));
};
*/