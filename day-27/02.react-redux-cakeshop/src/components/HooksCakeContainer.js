import React from 'react'
import { useSelector, useDispatch } from 'react-redux'
import { buyCake } from '../redux/cake/cakeActions'

const HooksCakeContainer = () => {
  const cakesCount = useSelector(state => state.numOfCakes)  
  const dispatch = useDispatch()

  return (
    <div>
      <h2>Number of Cakes: {cakesCount}</h2>
      <button onClick={() => dispatch(buyCake())}>Buy Cake</button>
    </div>
  )
}

export default HooksCakeContainer