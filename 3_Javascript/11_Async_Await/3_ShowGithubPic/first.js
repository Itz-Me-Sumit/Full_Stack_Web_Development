async function github() {
    
    try{
        const response = await fetch("https://api.github.com/users");4
        if(!response.ok){
            throw new Error("Data is not Present");
        }
        const data = await response.json();
        const parent = document.getElementById("first");

        for(let people of data){
            const element = document.createElement("div");
            element.classList.add("user")
        
            const pic = document.createElement("img");
            pic.src = people.avatar_url;
        
            const user_name = document.createElement("h2");
            user_name.textContent = people.login;
        
            const anchor = document.createElement("a");
            anchor.href = people.html_url;
            anchor.target = "_blank"
            anchor.textContent="Visit Profile";
            
            element.append(pic , user_name , anchor );
            parent.append(element);
        }
    }
    catch(error){
        console.log("Error : ",error);
    }
}

github();
