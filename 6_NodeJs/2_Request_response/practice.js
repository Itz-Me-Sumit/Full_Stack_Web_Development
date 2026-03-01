const http = require('http');
const server = http.createServer((req, res) => {

    console.log(req.url, req.method);

    if(req.url==='/home'){
        res.write(`<h1>Welcome to home page</h1>`);
        return res.end();
    }
    else if(req.url==='/men'){
        res.write(`<h1>Welcome to men page</h1>`);
        return res.end();
    }
    else if(req.url==='/women'){
        res.write(`<h1>Welcome to women page</h1>`);
        return res.end();
    }
    else if(req.url==='/kids'){
        res.write(`<h1>Welcome to kids page</h1>`);
        return res.end();
    }
    else if(req.url==='/cart'){
        res.write(`<h1>Welcome to cart page</h1>`);
        return res.end();
    }

    res.write(`
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Myntra</title>
        </head>
        <body>
    
        <header>
            <nav>
                <ul>
                    <li><a href="/home">Home</a></li>
                    <li><a href="/men">Men</a></li>
                    <li><a href="/women">Women</a></li>
                    <li><a href="/kids">Kids</a></li>
                    <li><a href="/cart">cart</a></li>
                </ul>
            </nav>
        </header>

        </body>
        </html>
    `)
    res.end();

})

server.listen(3000, () => {
    console.log(`server running on address http://localhost:3000`);
});


// home , men , women , kids , cart.