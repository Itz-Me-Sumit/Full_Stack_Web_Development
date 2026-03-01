import { useState } from 'react'


function App() {

  const [name , setName] = useState('');
  const [age , setAge] = useState('');
  const [password , setPassword] = useState('');

  function handleSubmit(e){
    e.preventDefault();
    console.log(name);
    console.log(age);
    console.log(password);
  }

  console.log('render');

  return(

    <>
    
      <form onSubmit={handleSubmit}>

        <div>
          <label>Name: </label> <br />
          <input type="text" value={name} onChange={(e)=>setName(e.target.value)} />
        </div>
          <br />
        <div>
          <label>Age: </label> <br />
          <input type="number" value={age} onChange={(e)=>setAge(e.target.value)} />
        </div>
          <br />
        <div>
          <label>Password: </label> <br />
          <input type="password" value={password} onChange={(e)=>setPassword(e.target.value)} />
        </div>
          <br />
        <button>Submit</button>

      </form>
    
    </>

  )

}

export default App
