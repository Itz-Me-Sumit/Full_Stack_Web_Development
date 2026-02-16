// array.slice(starting index , ending index) , ending index not included
//      - it doesn't modify original array.

let arr = [34,56,22,52,85,14,83,30,49,58];
sliced_arr=arr.slice(2,7);
console.log(sliced_arr);

// array.splice(starting array , how many we want to delete) :- it will delete that subarray.
//      - it'll modify original array.

let array = [34,56,22,52,85,14,83,30,49,58];
array.splice(2,7);
console.log(array);