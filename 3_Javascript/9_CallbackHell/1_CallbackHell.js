const orderDetail = {
    orderId:123123,
    food:["pizza" , "Biryani" , "coke"],
    cost:620,
    customerName:"Sumit",
    customer_location:"Begusarai",
    resturant_location:"Barauni",
    payment_status:false
}

function PlaceOrder(orderDetail , callback){
    console.log(`${orderDetail.cost}Rs , Payment in progress`);
    orderDetail.payment_status = true;
    setTimeout(()=>{
        console.log("Payment Is recived , Your Order is Placed");
        callback(orderDetail);
    } , 5000)
}

function PreparingOrder(orderDetail , callback){
    console.log(`Your Food "${orderDetail["food"]["0"]}" Prepritation Started`);
    setTimeout(()=>{
        console.log("Your Order is Now Prepared");
        callback();
    } , 3000)
}

function PickUpOrder(orderDetail , callback){
    console.log(`Delevery Boy is on the way to resturant ${orderDetail["resturant_location"]}`);
    setTimeout(()=>{
        console.log("I have PickUp The Order");
        callback();
    },3000)
}

function DeleveringOrder(orderDetail){
    console.log(`I'm on the way To delever Order on ${orderDetail["customer_location"]}`);
    setTimeout(()=>{
        console.log("Order Succesfully Delevered");
    },3000)
}


PlaceOrder(orderDetail , ()=>{
    PreparingOrder(orderDetail , ()=>{
        PickUpOrder(orderDetail , ()=>{
            DeleveringOrder(orderDetail);
        });
    });
});
