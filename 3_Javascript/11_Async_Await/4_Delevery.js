const orderDetail = {
    orderId:123123,
    food:["pizza" , "Biryani" , "coke"],
    cost:620,
    customerName:"Sumit",
    customer_location:"Begusarai",
    resturant_location:"Barauni",
    payment_status:false
}

function PlaceOrder(orderDetail ){
    console.log(`${orderDetail.cost}Rs , Payment in progress`);
    return new Promise((resolve , reject)=>{
        setTimeout(()=>{
        console.log("Payment Is recived , Your Order is Placed");
        orderDetail.payment_status = true;
        resolve(orderDetail);

        } , 5000)
    })
}

function PreparingOrder(orderDetail ){
    console.log(`Your Food "${orderDetail["food"]}" Prepritation Started`);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
        console.log("Your Order is Now Prepared");
        resolve(orderDetail);
        } , 3000)
    })
}

function PickUpOrder(orderDetail ){
    console.log(`Delevery Boy is on the way to resturant ${orderDetail["resturant_location"]}`);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
        console.log("I have PickUp The Order");
        resolve(orderDetail);
        },3000)
    })
    
}

function DeleveringOrder(orderDetail){
    console.log(`I'm on the way To delever Order on ${orderDetail["customer_location"]}`);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
        console.log("Order Succesfully Delevered");
        resolve(orderDetail);
        },3000)
    })
    
}

async function Ordering() {
    
    try{
        const response1 =  await PlaceOrder(orderDetail);
        const response2 = await PreparingOrder(response1);
        const response3 = await PickUpOrder(response2);
        const response4 = await DeleveringOrder(response3);
        console.log(response4);
    }
    catch(error){
        console.log("Error : " , error); 
    }
}
Ordering();