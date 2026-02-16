// Convert JS Object Into JSON
const obj = {
    name:"Sumit",
    age:21,
    address:"Begusarai",
}

const JSON_Format = JSON.stringify(obj);
console.log(JSON_Format);



// Convert JSON into JS Object.
const Real_JSON_Format = `{
    "name":"Sumit",
    "age":21,
    "address":"Begusarai"
}`;

const jsObject = JSON.parse(Real_JSON_Format);
console.log(jsObject);