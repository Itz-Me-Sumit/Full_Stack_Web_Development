// Core Moudule
const http = require('http');

// Local Module
const requestHandler = require('./user');

// External Module
const express = require('express');
const app = express()

// Middleware
app.use("/",(req,res,next)=>{
    console.log("Came In First Middleware", req.url , req.method);
    res.send("<p>Hellow Welcome to Website</p>")
    next();
})
app.use( "/submit-details",(req,res,next)=>{
    console.log("Came In Second Middleware",req.url , req.method);
    res.send("<p>Hey I'm Doing Express First Time</p>");
})

const server = http.createServer(app);

const PORT = 3000;
server.listen(PORT , ()=>{
    console.log(`Server running on address http://localhost:${PORT}`);
});