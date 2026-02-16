/*   Math    */

console.log(Math.abs(-4));
console.log(Math.PI);
console.log(Math.LN10);
console.log(Math.ceil(2.3) , Math.floor(2.3));
console.log(Math.pow(2,3));

console.log(Math.random()); // Generate random Number between 0 and 1 ; 0 is included but 1 is not included.

// if we want 0-10 in Math.random()
console.log( Math.floor( (Math.random())*10 ) + 1 );

// if we want 1-10 in Math.random()
console.log( Math.ceil( (Math.random())*10 ) )

// Generate 4-Digit OTP : 1000-9999
let max=9999 , min=1000;
console.log( Math.floor( ( ( Math.random() ) * ((max-min)+1) ) ) + min );