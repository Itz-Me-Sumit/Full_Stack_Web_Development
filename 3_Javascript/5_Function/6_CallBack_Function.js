// CallBack :- function passed as parameter in function

function greet(){
    console.log("Hello Guys")
}
function meet(callback){
    console.log("How are You");
    callback();
    console.log("I have finished meeting.")
}

meet(greet); // pehle meet function call hoga then greet function.