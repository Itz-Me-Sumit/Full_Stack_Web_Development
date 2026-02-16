console.log("Hello World Start");

/*

    const p1 = fetch("https://api.github.com/users")

    // FullFilled , Rejected
    const p2 = p1.then((response)=>{
        return response.json();
    })

    p2.then((data)=>{
        console.log(data);
    })

*/

/*

    fetch("https://api.github.com/users")
    .then((response)=>{
        return response.json();
    })
    .then((data)=>{
        console.log(data);
    })

*/


fetch("https://api.github.com/users")
.then((response)=>{
    return response.json();
})
.then((data)=>{
    
    if(!response.ok){
        throw new Error("Data is not present in server");
    }
    
    for(let i=0 ; i<data.length ; i++){
        const parent = document.getElementById("first");
        const pic = document.createElement("img");
        pic.src = data[i].avatar_url; 
        pic.style.height = "40px";
        pic.style.width = "40px";
        parent.append(pic);
    }
})
.catch((error)=>{
    const parent = document.getElementById("first");
    parent.textContent = error.message;
})

console.log("Hello World Ends")