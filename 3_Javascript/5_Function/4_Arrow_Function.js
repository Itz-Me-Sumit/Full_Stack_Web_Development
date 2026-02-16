// Arrow Function

const addNumber = () => {
    console.log("Hello Sumit");
}
addNumber();


const add = (num1 , num2) => {
    return num1+num2;
}
console.log(add(3,4));


// if we only want to return no need to explicitly write return statement.
const multiply = (num1 , num2) => num1*num2;
console.log(multiply(3,4));


// if we only have one parameter, then no need to write that parameter into braces.
const square = num => num**2;
console.log(square(3));


// in object, we have to put object into curly braces.
const obj = () => ( {name:"Sumit" , age:21} );
console.log(obj());


