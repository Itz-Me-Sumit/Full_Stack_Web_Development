const form = document.querySelector("form");
form.addEventListener('submit' , (e)=>{
    e.preventDefault();
    const incomeinput = document.getElementById('income').value;
    const amount = parseInt(incomeinput);
    let totaltax=0;
    
    if (isNaN(amount) || amount < 0) {
        result.textContent = "Please enter a valid income";
        return;
    }

    if(amount<=1200000){
        totaltax=0;
    }
    else if(amount<=1600000){
        totaltax=(amount - 1200000)*0.15;
    }
    else if(amount<=2000000){
        totaltax=(amount-1600000)*0.2 + 60000;
    }
    else if(amount<=2400000){
        totaltax=(amount-2000000)*0.25 + 60000 + 80000;
    }
    else{
        totaltax=(amount-2400000)*0.3 + 60000 + 80000 + 100000;
    }
    const result = document.querySelector('h2');
    result.textContent=`Tax: ${totaltax}`;

})