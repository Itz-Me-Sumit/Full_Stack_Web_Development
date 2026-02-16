const http = require('http');
const server=http.createServer((request,response)=>{
    console.log(request);
    // process.exit(); -> it stops our server
});
const PORT=3000;
server.listen(PORT,()=>{
    console.log(`Server running on address http://localhost:${PORT}`)
});