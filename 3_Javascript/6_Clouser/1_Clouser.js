// Clouser :- A Function that remembers variables from its outer scope even after the outer function has finished executing.

function createcounter(){

    let count = 0;
    function increment(){
        count++;
        return count; 
    }

    return increment;

}

const counter = createcounter();
console.log(counter());
console.log(counter());
console.log(counter());