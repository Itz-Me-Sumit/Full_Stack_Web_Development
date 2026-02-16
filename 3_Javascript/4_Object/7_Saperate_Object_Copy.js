const user = {
    name : "Sumit",
    age : 21,
    emailid : "itzmesumit42@gmail.com",
    amount : 10,
    address: {
        city:"Begusarai",
        state:"Bihar",
        pincode:1234,
        post:"Bihat"
    }
}

// shallow copy
const user2 = {...user};
console.log(user2);
user2.name="Shivam";
console.log(user);


// deep copy
const user3 = structuredClone(user)
console.log(user3);