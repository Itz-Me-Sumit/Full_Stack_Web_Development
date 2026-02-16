// arr.flat(level)

const arr = [20,45,13,[90,25,[34,52,67,91],64,84],88,93,27];

const new_arr1=arr.flat();
console.log(new_arr1);

const new_arr2=arr.flat(2);
console.log(new_arr2);

const new_arr3=arr.flat(Infinity);
console.log(new_arr3);