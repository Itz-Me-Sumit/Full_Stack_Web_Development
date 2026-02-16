// in Map , all Elements are in [ Key , Value ] pair 
// Key can be -> string , boolean , Number , array , set(by another mehtod)

const M = new Map([
    ["Sumit" , 21],
    [2 , "hello"],
    [true , [3,4,5]],
    [[3,4,5,5] , "Shivam"]
])
console.log(M);

// insert Set.
M.set({name:"sumit" , age:21} , true); // Key-Value pair
console.log(M);

// get value of Map.
console.log(M.get("Sumit"))

// check presence of any element.(put always key)
console.log(M.has("Sumit"));

// size
console.log(M.size);

// iterate
for(let [Keys , Value] of M){  // destructuring
    console.log(Keys , Value);
}