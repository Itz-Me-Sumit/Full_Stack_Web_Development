
/*
function handleClick(){
    const element = document.getElementById("first");
    element.textContent = "I'll Be Best Coder in this World";
}

const elm = document.getElementById("second");
elm.onclick = function handleClick1(){
    elm.textContent = "Now The Text Get Changed By a Click";
}
*/

/*
// Here we can add multiple functions into elements. and next written function will not overwrite previous function
// i passed a "click" function and a callback function.
const elem = document.getElementById("third");
elem.addEventListener("click" , ()=>{
    elem.textContent = "I'll be The Best Coder in The World";
})

elem.addEventListener("click" , ()=>{
    elem.style.backgroundColor = "brown";
})
*/

/*
const child1 = document.getElementById("child1")
child1.addEventListener("click" , ()=>{
    child1.textContent = "I'm Clicked";
})
*/


/*
const parent = document.getElementById("parent");
for(let child of parent.children){
    child.addEventListener("click" , ()=>{
        child.textContent="I'm Clicked";
    })
}
*/

const parent = document.getElementById("parent");
function HandleClick(p){
    p.target.textContent = "I'm Clicked";
}
parent.addEventListener("click" , HandleClick);
// parent.removeEventListener("click" , HandleClick);