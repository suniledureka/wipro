import React from 'react'
import { useSelector, useDispatch } from 'react-redux'
import { ordered, restocked } from '../features/cake/cakeSlice'

const CakeContainer = () => {
  const cakesInStock = useSelector(state => state.numOfCakes)
  const dispatch = useDispatch()

  return (
    <div>
      <h3>Number of Cakes: {cakesInStock}</h3>
      <button onClick={() => dispatch(ordered())}>Order Cake</button>
      <button onClick={() => dispatch(restocked(3))}>Restock Cakes</button>
    </div>
  )
}

export default CakeContainer
