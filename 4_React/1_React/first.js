const element1 = React.createElement("h1" , {className:"element" , id:"first" , style:{fontSize:"30px" , backgroundColor:"pink" , color:"white"}} , "I'm Learning React");
const element2 = React.createElement("h2" , {className:"element" , id:"second" , style:{fontSize:"40px" , backgroundColor:"purple" , color:"orange"}} , "It is 2nd Element");

const div = React.createElement('div' , null , element1 , element2);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(div);


// ReactDOM.render(element1 , document.getElementById('root'));
// ReactDOM.render(element2 , document.getElementById('root'));