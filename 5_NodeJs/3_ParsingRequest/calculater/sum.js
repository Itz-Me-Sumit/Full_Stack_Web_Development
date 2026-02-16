const sumRequestHandler = (req,res)=>{
    console.log("In Sum Request Handler",req.url);
    const body=[];
    req.on('data',chunk => body.push(chunk));
    req.on('end',()=>{
        const bodystr = Buffer.concat(body).toString();
        const param = new URLSearchParams(bodystr);
        const bodyobj = Object.fromEntries(param);
        const result = Number(bodyobj.first) + Number(bodyobj.second);
        console.log(result);
        res.setHeader("Content-Type",'text/html');
        res.write(`
            <html>
                <head><title>Calculater</title></head>
                <body>
                    <h1>Your Sum is ${result}</h1>
                    <a href="/calculater">Go to Calculater</a>
                </body>
            </html>
        `);
        return res.end();
    });
    

}

exports.sumRequestHandler = sumRequestHandler;