// const str1="Sumit";
// const str2='Sumit';

// const str3=`Sumit`; // Modern way to write String

// const str4=`Sumit is
// Sobar boy`

// console.log(str3);
// console.log(str4);


const day=100;
str5=`sumit is sobar ${day}`;
console.log(str5);


const string=`Hello I am Sumit and i am Sumit`;
console.log(string.length);
console.log(string[0]);

// UpperCase
console.log(string.toUpperCase());

// LowerCase
console.log(string.toLowerCase());

// search substring index.
console.log(string.indexOf('Sum'));
console.log(string.lastIndexOf('Sum'));
console.log(string.includes('and'));
console.log(string.slice(2,10)); // from index 2 to 9.
console.log(string.slice(3)); // from index 3 to all.
console.log(string.slice(-4)); // last 4 element;
console.log(string.substring(2,9));

const a="Sumit";
const b="Sah";
const c=a+ " " +b;
console.log(c);


// Replace
const str=`Hii i'am Sumit and i'm kinda Good Boy`;
console.log(str.replace('Good' , 'Bad'));

// trim
const user=`    Sumit     `;
console.log(user.trim());

// split
const names=`Rohit , Mohit , Suraj , Anjali`;
console.log(names.split(','));
const dob=`10-11-2006`;
console.log(dob.split('-'));