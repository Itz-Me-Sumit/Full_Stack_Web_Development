// If we put Async before any function , means we are saying that this function is Asynchronous...
// async always return a promise.

async function greet(){
    return "Sumit";
    // Another way to return promise.
    
    return new Promise((resolve,reject)=>{
        resolve("Sumit");
    })

}
const response = greet();
response.then((data)=>console.log(data))
.catch((error)=>{console.log("Error: ",error)})