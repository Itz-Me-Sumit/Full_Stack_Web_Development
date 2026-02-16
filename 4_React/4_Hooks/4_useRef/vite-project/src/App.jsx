import { useState } from 'react'
import {useRef} from 'react'

function App(){

  const [time , setTime] = useState(0);

  const intervalIdRef=useRef(null);

  function handlestart(){
    if(intervalIdRef.current!=null){
      return;
    }
    intervalIdRef.current = setInterval(()=>{
      setTime(time=>time+1);
    },1000);

  }

  function handlestop(){
    clearInterval(intervalIdRef.current);
    intervalIdRef.current=null;
  }

  function handlereset(){
    clearInterval(intervalIdRef.current);
    intervalIdRef.current=null;
    setTime(0);
  }

  return(
    <>
    
      <h1>Stopwatch: {time}</h1>
      <div>
        <button onClick={handlestart}>Start</button>
        <button onClick={handlestop}>Stop</button>
        <button onClick={handlereset}>Reset</button>
      </div>

    </>
  )

}

export default App;