const TotalPrice = products.reduce((accumulator , currentValue) => {
    return accumulator + currentValue.price;
},0);

console.log(TotalPrice);
