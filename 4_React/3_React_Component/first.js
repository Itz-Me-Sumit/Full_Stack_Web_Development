/*
    React component just a function who returns JSX
*/

function App(){
    return (
        <h1>Hello Sumit Coder</h1>
    )
}
const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(App());



const courses = ["HTML" , "CSS" , "Javascript" , "React"];
const element = (
    <ul>
        {courses.map(course=><li>{course}</li>)}
         {/* {[<li>HTML</li> , <li>CSS</li> , <li>Javascript</li> , <li>React</li>]}  */}
    </ul>
)

const root2 = ReactDOM.createRoot(document.getElementById('root'));
root2.render(element)



function App2(props){
    return(
        <h1>Hello Coder {props.name} and your is {props.age} </h1>
    )
}

const element2 = <App2 name="Sumit" age={21}></App2>
const root3 = ReactDOM.createRoot(document.getElementById("root"));
root3.render(element2);