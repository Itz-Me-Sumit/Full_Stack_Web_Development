
const fs = require('fs');
const userRequestHandler = (request,response)=>{
    console.log(request.url , request.method );
    
    if(request.url==='/'){
        
        response.setHeader("Content-Type",'text/html');
        response.write('<html>');
        response.write('<head><title>Complete Coding</title></head>');
        response.write('<body><h1>Enter Your Details:</h1>');
        response.write('<form action="/submit-details" method="POST">');
        response.write('<input type="text" name="username" placeholder="Enter your name"><br>');
        response.write('<label for="male">Male</label>')
        response.write('<input type="radio" id="male" name="gender" value="male" />')
        response.write('<label for="female">Female</label>')
        response.write('<input type="radio" id="female" name="gender" value="female" />')
        response.write('<br><input type="submit" value="Submit">');
        response.write('</form>');
        response.write('</body>');
        response.write('</html>');

        return response.end();
        
    }

    else if(request.url.toLowerCase() === '/submit-details' && request.method == "POST"){
        const body = [];
        request.on('data', (chunk)=>{
            console.log(chunk);
            body.push(chunk);
        })
        request.on('end',()=>{
            const fullBody = Buffer.concat(body).toString();
            const params = new URLSearchParams(fullBody);
            // const jsonObject = {}
            // for( const [key,value] of params.entries()){
            //     jsonObject[key]=value;
            // }
            const jsonObject = Object.fromEntries(params);
            console.log(jsonObject)
            console.log(fullBody);
            fs.writeFile('user.txt',JSON.stringify(jsonObject),error=>{
                console.log("data returned Successfully !!")
                response.statusCode = 302;
                response.setHeader('Location','/');
                return response.end();
            });
        })        
    }

    else if(request.url==='/products'){
        
        response.setHeader("Content-Type",'text/html');
        response.write('<html>');
        response.write('<head><title>Complete Coding</title></head>');
        response.write('<body>check out our products</body>');
        response.write('</html>');

        return response.end();
        
    }
    // if we put route other then already created route, following will show
    response.setHeader("Content-Type",'text/html');
    response.write('<html>');
    response.write('<head><title>Complete Coding</title></head>');
    response.write('<body><h1>Welcome to Home</h1></body>');
    response.write('</html>');
    response.end();

    // process.exit(); -> it stops our server
};

module.exports = userRequestHandler;