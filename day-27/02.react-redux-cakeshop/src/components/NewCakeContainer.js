import React, { useState } from 'react'
import { useSelector, useDispatch } from 'react-redux';
import { buyCake } from '../redux/cake/cakeActions';

const NewCakeContainer = () => {
  const [cakesToBuy, setCakesToBuy] = useState(1);

  const numOfCakes = useSelector(state => state.numOfCakes)   
  const dispatch = useDispatch()

  return (
    <div>
      <h2>Number of Cakes: {numOfCakes}</h2>
      <input type="text" value={cakesToBuy} onChange={evt => setCakesToBuy(evt.target.value)}/>
      <button onClick = {() => dispatch(buyCake(cakesToBuy))}>Buy Cakes</button>
    </div>
  )
}

export default NewCakeContainer
