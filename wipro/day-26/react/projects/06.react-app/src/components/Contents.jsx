import React from 'react'
import Logo from '../assets/logo.png'
import './contents.css'

const Contents = () => {
  let topicName = 'React.js Components';

  return (
    <div className="left-align">
      <img src={Logo} alt="" className="logo"/>
      <h2>React.js Topics</h2>
      <h3>25 + 74</h3>
      <h3>{25 + 74}</h3>
      <h2>Todays Topic: {topicName}</h2>
    </div>
  )
}

export default Contents
