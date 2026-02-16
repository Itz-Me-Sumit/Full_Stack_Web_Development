
// - Crearting New Element.
const newElement1 = document.createElement("h2");
// give a id and text.
newElement1.textContent = "Who Are You hehehe";
newElement1.id = "second";

// - now put this h2 into display.
// i want to put h2, behind h1 so firstly i have to select h1
const elm = document.getElementById("first");
// now i'll put newElement(h2) , after elm(h1)
elm.after(newElement1);

// creating another new element.
const newElement2 = document.createElement("h3");
newElement2.textContent = "Doing JavaScript";
newElement2.id = "third";
// these assignment of className are not good practice.
// newElement2.className = "makarsankaranti";
// newElement2.className = "Winter";
newElement2.classList.add("Diwali");
newElement2.classList.add("makarsankaranti");
// Give Background Color.
newElement2.style.backgroundColor="pink";
newElement2.style.fontSize="50px";
elm.before(newElement2);

/*

// creating an another element called list.
const list = document.createElement("li");
list.textContent = "Masala_Dosa";
const list2 = document.createElement("li");
list2.textContent = "Pizza";
const list3 = document.createElement("li");
list3.textContent = "Burgur";
const list4 = document.createElement("li");
list4.textContent = "Roll";
// i want to put this list into ul(unordered list) which is written in html file
// first i have to select that ul.
const unordered_list=document.getElementById("listing");
unordered_list.append(list);
unordered_list.append(list2);
unordered_list.prepend(list3);
// if i want to put list4 at 2nd position.
// so as we know that all list is children of unordered_list so,
unordered_list.children[0].after(list4);
// index=0 karke first list ko select kar liya then uske after me list4 daal diya.

*/


// here we first create list saperately then push it to site at once.

const arr = ["masala_dosa" , "pizza" , "burgur" , "Roll" , "tacco" ];
const unordered_list = document.getElementById("listing");
// i created fragment and first append all element into this fragment then append this fragment to unordered_list.
const fragment = document.createDocumentFragment();
for(let food of arr){
    const list = document.createElement("li");
    list.textContent = food;
    fragment.append(list)
    
}
unordered_list.append(fragment);