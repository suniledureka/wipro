import React, { useState } from 'react'
//usestate() hook with object as state variable
const Counter3 = () => {
    const [details, setDetails] = useState({
        count: 0,
        text: ''
    })
    
    const handleIncrement = () => {
        console.log({...details})
        setDetails({
            ...details,      //spread operator in JS
            count: details.count + 1
        })
    }

    const handleChange = (event) => {
        setDetails({
            count: 0,
            text: event.target.value
        })
    }

    return (
        <div className="box">
            <input
                type="text"
                size="25"
                autoFocus="autofocus"
                placeholder='enter text'
                value={details.text}
                onChange={handleChange}
            />

            <p>
                <span style={{ color: 'blue' }}>{details.text}</span> &nbsp;
                clicked &nbsp;
                <span style={{ color: 'red' }}>{details.count}
                </span>  times</p>

            {/* <button className="btn_add" onClick={handleIncrement}>Increment</button> */}
            <button className="btn_add" onClick={() => setDetails({...details, count: details.count+1})}>Increment</button>
        </div>
    )
}

export default Counter3
