// External Module
const express = require('express');
const app = express()

app.use("/" , (req,res,next)=>{
    console.log("First Dummy Middleware" , req.url , req.method);
    next();
})
app.use("/" , (req,res,next)=>{
    console.log("Second Dummy Middleware", req.url , req.method);
    next();
})
/*app.use("/" , (req,res,next)=>{
    console.log("Third Dummy Middleware", req.url , req.method);
    res.send("<h1>Just Practicing Express Js</h1>");
})*/
app.get("/" , (req,res,next)=>{
    console.log("Handling / for GET", req.url , req.method);
    res.send("<h1>Just Practicing Express Js</h1>");
})
app.get("/contact-details" , (req,res,next)=>{
    console.log("Handling /contact-us for GET", req.url , req.method);
    res.send(`
        <h1>Please Give Your Details</h1>
        <form action="/contact-us" method="POST">
            <input type="text" name="name" placeholder="Enter Your Name">
            <br><br>
            <input type="email" name="Email" placeholder="Enter Your Email">
            <br><br>
            <input type="submit">
        </form>
    `);
})
app.post("/contact-details" , (req,res,next)=>{
    console.log("Handling /contact-us for POST", req.url , req.method);
    res.send(`
        <h1>We will contact You Shortly</h1>
        <form action="/contact-us" method="POST">
            <input type="text" name="name" placeholder="Enter Your Name">
            <br><br>
            <input type="email" name="Email" placeholder="Enter Your Email">
            <br><br>
            <input type="submit">
        </form>
    `);
})


const PORT = 3000;
const server = app.listen(PORT , ()=>{
    console.log(`Server is Running on Address http://localhost:${PORT}`)
})