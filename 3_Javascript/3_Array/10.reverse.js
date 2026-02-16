// array.reverse();

const arr1 = ["rob" ,"alice" , "sumit" ,"bob"  ];
const arr2 = [54,25,9,123,112,4,23,66,92,43,79];

const arr1_reverse = arr1.reverse();
console.log(arr1_reverse);

const arr1_reverse_sort = arr1.sort().reverse();
console.log(arr1_reverse_sort);

const arr2_reverse = arr2.reverse();
console.log(arr2_reverse);

const arr2_reverse_sort = arr2.sort((a,b)=>a-b).reverse();
console.log(arr2_reverse_sort);