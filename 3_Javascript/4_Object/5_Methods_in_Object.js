const user = {
    name : "Sumit",
    age : 21,
    emailid : "itzmesumit42@gmail.com",
    amount : 10,
    greeting:function(){
                console.log(`Hello I'm Sumit ${this.age}`);
                return 100;
            }
}

console.log(user.greeting());