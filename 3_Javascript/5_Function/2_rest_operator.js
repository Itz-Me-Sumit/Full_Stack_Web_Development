// rest operator :- put "...num" as argument in function.
// it'll create a array and will return sum of all num we want.

function addNumber(...num){
    let sum=0;
    for(let n of num) sum+=n;
    console.log(sum);
}

addNumber(12,32,54,43,12,90,55,87,33) 