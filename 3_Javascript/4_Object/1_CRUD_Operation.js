// Object
// all things are in Key-Value pair.

    // CRUD -> Create , Read , Update , Delete.

// 1) Create
const user = {
    name : "Sumit",
    age : 21,
    emailid : "itzmesumit42@gmail.com",
    amount : 10
}


// 2) Read
console.log(typeof user);
console.log(user);
console.log(user.age , user.emailid);
console.log(user["name"]);
console.log(user["age"]);

// 3) Update
user.amount=500
console.log(user);

user.aadhar = 1233;  // insert new value
console.log(user);


// 4) Delete
delete user.emailid;
console.log(user);


