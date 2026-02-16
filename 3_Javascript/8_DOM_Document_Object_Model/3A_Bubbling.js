
const grandparent = document.getElementById("grandparent");
grandparent.addEventListener("click" , (grpar)=>{
    // console.log("GrandParent is Clicked")
    console.log(grpar)
    console.log(grpar.target) // it'll show which element was clicked that this element get targeted.
},true) // here "true" is depecting capture phase :- By Default it is false and if we turn it to true then capture phase will get activated.

const parent = document.getElementById("parent");
parent.addEventListener("click" , (par)=>{
    // console.log("Parent is Clicked")
    console.log(par)
    // par.stopPropagation(); // it'll stop bubbling.
},true)

const child = document.getElementById("child");
child.addEventListener("click" , (child)=>{
    console.log("child is Clicked")
},true)