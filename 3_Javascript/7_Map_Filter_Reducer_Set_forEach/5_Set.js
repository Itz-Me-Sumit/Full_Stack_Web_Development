// set data structure only contains unique values.

const arr = [1,1,2,3,4,5,5,6,6,6,6,9,0,0];

// initlize set.
const s = new Set(arr);
console.log(s);

// convert into set for unique element and make it array again by spread operator.
const uniqueElement = [...new Set(arr)]
console.log(uniqueElement);

// adding element into set
s.add(11);
console.log(s);

// check wheather an element present into set or not
console.log(s.has(3))

// delete any element which present in set
s.delete(1);
console.log(s);

// size of set.
console.log(s.size);

// clear set.
s.clear();
console.log(s);