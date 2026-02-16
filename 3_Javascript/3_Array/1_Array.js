let marks = [1,2,3,4,5];
console.log(marks);
console.log(marks.length);

let arr = [100, 30 , "Sumit" , true];

console.log(arr[1]);

arr[2]="Shivam";
console.log(arr);


// add at end.
arr.push(false);
console.log(arr);

// add at start.
arr.unshift("hellow");
console.log(arr);


// delete last element.
arr.pop();
console.log(arr);

// delete first element.
arr.shift();
console.log(arr);


let array=[10,20,30,40,50];
for(let i=0 ; i<array.length;i++){
    console.log(array[i]);
}

for(let num of array){
    console.log(num);
}

// slice
const arr2=array.slice(2,4); // slice(starting index , ending index)
    // it doesn't change original array.
console.log(arr2);

// splice :- delete in original array.
array.splice(2,4); // .splice(from index , to index)
console.log(array);

// merge two array.
let ar1=[1,2,3];
let ar2=[4,5,6];
let new_arr=ar1.concat(ar2);
console.log(new_arr);