// const element1 = React.createElement("h1" , {className:"element" , id:"first" , style:{fontSize:"30px" , backgroundColor:"pink" , color:"white"}} , "I'm Learning React");
// const element2 = React.createElement("h2" , {className:"element" , id:"second" , style:{fontSize:"40px" , backgroundColor:"purple" , color:"orange"}} , "It is 2nd Element");

// const div = React.createElement('div' , null , element1 , element2);

// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(div);



const element1 = <h2 id="title" >I'm Sumit , using Babel First Time</h2>
const root1 = ReactDOM.createRoot(document.getElementById('root'));
root1.render(element1);

const element2 = ( <div>
    <h2> Hii whatsupppp... </h2>
    <p> React and Babel Making my life Easier </p>
</div> )
const root2 = ReactDOM.createRoot(document.getElementById('root'));
root2.render(element2);