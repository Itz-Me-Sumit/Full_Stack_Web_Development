const user = {
    name : "Sumit",
    age : 21,
    emailid : "itzmesumit42@gmail.com",
    amount : 10
}

// extract Keys
for(let x in user){
    console.log(x)
}


// extract Values
for(let x in user){
    console.log(user[x]);
}


let keys = Object.keys(user);
for(let key of keys){
    console.log(user[key]);
}

for(let key of Object.keys(user)) console.log(user[key]);

for(let value of Object.values(user)) console.log(value);