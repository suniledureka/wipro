import React from 'react'
import { actions } from '../features/counter/counterSlice';
import { useSelector, useDispatch } from 'react-redux'

const Counter = () => {
    const counter = useSelector((state) => state.count);
    const dispatch = useDispatch()

    const increase = () => {
        dispatch(actions.increment())
    }

    const decrease = () => {
        dispatch(actions.decrement())
    }

    const addBy5 = (qty) => {
        dispatch(actions.add(5))
    }

    return (
        <div className="card w-25 p-4 m-auto mt-5">
            <div className="card-body">
                <h3>Counter:
                    <span className="text-primary"> {counter} </span>
                </h3>
            </div>

            <div className="mt-3">
                <button onClick={increase} className="btn btn-success me-3">Increment</button>
                <button onClick={decrease} className="btn btn-danger me-3">Decrement</button>
                <button onClick={() => addBy5(5)} className="btn btn-info">Add By 5</button>
            </div>
        </div>
    )
}
export default Counter
