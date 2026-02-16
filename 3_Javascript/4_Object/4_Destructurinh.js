const user = {
    name : "Sumit",
    age : 21,
    emailid : "itzmesumit42@gmail.com",
    amount : 10
}

// const {put keys} = object_name

const {name , age} = user;  
console.log(name,age);

const {name:UserName , age:UserAge} = user;
console.log(UserName , UserAge);

for(let [key , value] of Object.entries(user)) console.log(key,value);