import React, {useState} from 'react'

const DataEntry = () => {
  let [text, setText] = useState('')  

  let handleChange = (e) => {
     setText(e.target.value)   
  }

  return (
    <div>
      <input value={text} onChange={handleChange} disabled={false}/>
      <p>{text}</p>
    </div>
  )
}

export default DataEntry
