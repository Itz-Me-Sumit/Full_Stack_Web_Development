const result = document.getElementById('result');

setInterval( ()=>{
    const currentTime = Date.now();
    const olympicTime = new Date(2028 , 6 , 14).getTime();
    let timer = olympicTime - currentTime;

    const days = Math.floor((timer)/(1000*60*60*24));
    timer%=1000*60*60*24;
    const hours = Math.floor((timer)/(1000*60*60));
    timer%=1000*60*60;
    const minute = Math.floor((timer)/(1000*60));
    timer%=1000*60;
    const second = Math.floor((timer)/(1000))
    timer%=1000
    result.textContent = `${days}Days , ${hours}Hours , ${minute}Minutes , ${second}Second`;
},1000 )

