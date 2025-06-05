import React, { useState } from 'react'

const Counter2 = () => {
    const [count, setCount] = useState(0);
    const [text, setText] = useState('');

    const handleIncrement = () => {
        setCount(count + 1)
    }

    const handleChange = (event) => {
        setText(event.target.value)
        console.log(event.target.value, text)
        setCount(0)
    }

    return (
        <div className="box">
            <input
                type="text"
                size="25"
                autoFocus="autofocus"
                placeholder='enter text'
                value={text}
                onChange={handleChange}
            />

            <p>
                <span style={{ color: 'blue' }}>{text}</span> &nbsp;
                clicked &nbsp;
                <span style={{ color: 'red' }}>{count}
                </span>  times</p>

            <button className="btn_add" onClick={handleIncrement}>Increment</button>
        </div>
    )
}

export default Counter2
