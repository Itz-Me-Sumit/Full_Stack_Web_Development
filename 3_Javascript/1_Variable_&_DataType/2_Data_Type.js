// Data Type --> 1) Primitive Data Type
//               2) Non Primitive Data Type

/*

    1) Primitive Data Type. (7 Dat Type)
        -- Number, string, boolean, undefine, null ,bigint ,symbol 

    2) Non-Primitive Dat Type.
        -- Array, Object, Function. 

*/

// Number
let a=10;
let b=22.34;
console.log(a,b);
console.log(typeof a);

// string 
let c ="Sumit is Daddy Coder";
let d ="\nDaddy Sumit";
console.log(c,d);

// boolean
let login=true;
let password=false;
console.log(login,password);

//undefine :- value is not assign
let user;
console.log(user);
/*
const abc; // 'const' can't ne undefine, we have to assing it any value
*/

// bigint :- put 'n' at last of that big integer
let num=5454654464844544n;
console.log(num);

// null
let weather=null;
console.log(weather);
console.log(typeof weather);

// symbol
const id1 = Symbol("id");
console.log(id1);
console.log(typeof id1)

//array
let arr=[1,2,3,4,"sumit",true];
console.log(arr);
console.log(typeof arr);

// Object

let obj={
    name:"Sumit",
    roll_num:234,
    age:21,
    category:"OBC"
}

console.log(typeof obj);

// function
//      - we can store function in any variable in javascript.

function add(a,b){
    return a+b;
}

fn_result=add(2,3);
console.log(fn_result);


let fn = function multiply(a,b){
    return a*b;
}

console.log(fn);
console.log(typeof fn);
