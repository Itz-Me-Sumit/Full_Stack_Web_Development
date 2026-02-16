const arr = [10 , 40 , "Sumit", false]

arr.forEach((num) => {
    console.log(num);
})


arr.forEach((num, index)=>{
    console.log(num, index);
})


arr.forEach((num , index , arr) => {
    console.log(num , index , arr);
})


const arr2 = [1,2,3,4,5,6];
let sum = 0;
arr2.forEach((n)=>{
    sum+=n;
})
console.log(sum);