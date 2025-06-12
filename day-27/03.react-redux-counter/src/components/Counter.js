import React from 'react'
import { useSelector, useDispatch } from 'react-redux'
import { ADD, DECREMENT, INCREMENT } from '../store';

const Counter = () => {
    const counter = useSelector((state) => state.count);
    const dispatch = useDispatch()

    const increment = () => {
        dispatch({ type: INCREMENT })
    }

    const decrement = () => {
        dispatch({ type: DECREMENT })
    }

    const add = (qty) => {
        dispatch({ type: ADD, 
                   payload: qty })
    }

    return (
        <div className="card w-25 p-4 m-auto mt-5">
            <div className="card-body">
                <h3>Count Value: 
                    <span className="text-primary">  {counter} </span>
                </h3>
            </div>

            <div className="mt-3">
                <button onClick={increment} className="btn btn-success me-3">Increment</button>
                <button onClick={decrement} className="btn btn-danger me-3">Decrement</button>
                <button onClick={() => add(5)} className="btn btn-info">Add By 5</button>
            </div>
        </div>
    )
}
export default Counter
