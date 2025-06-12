import React, {useContext} from 'react'
import { UserContext } from '../App'
import { ChannelContext } from '../App'

const ComponentC = () => {
  const user = useContext(UserContext) 
  const channel = useContext(ChannelContext)

  console.log(user) 
  return (
    <div>
      <h2>Component C - {user} - {channel}</h2>
    </div>
  )
}

export default ComponentC
