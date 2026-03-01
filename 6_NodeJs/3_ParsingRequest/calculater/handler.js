const { sumRequestHandler } = require("./sum");

const requestHandler = (req , res) => {
    console.log(req.url,req.method);

    if(req.url === '/'){
        res.setHeader("Content-Type",'text/html');
        res.write(`
            <html>
                <head><title>Calculater</title></head>
                <body>
                    <h1>Welcome to Calculater</h1>
                    <a href="/calculater">Go to Calculater</a>
                </body>
            </html>
        `);
        return res.end();
    }

    else if(req.url.toLowerCase() === "/calculater"){
        res.setHeader("Content-Type",'text/html');
        res.write(`
            <html>
                <head><title>Calculater</title></head>
                <body>
                    <h1>Here is the Calculater</h1>
                    <form action="/calculate-result" method="POST">
                        <input type="text" placeholder="first num" name="first">
                        <input type="text" placeholder="second num" name="second">
                        <input type="submit" value="sum"></input>
                    </form>
                    <a href="/calculater">Go to Calculater</a>
                </body>
            </html>
        `);
        return res.end();
    }

    else if(req.url.toLowerCase()==='/calculate-result' && req.method==='POST'){
        return sumRequestHandler(req,res);
    }

    res.setHeader("Content-Type",'text/html');
        res.write(`
            <html>
                <head><title>Calculater</title></head>
                <body>
                    <h1>404 Page does not exist</h1>
                    <a href="/">Go to Home</a>
                </body>
            </html>
        `);

}


exports.requestHandler = requestHandler;