import React from 'react'
import { createElement } from 'react'

const Header = () => {
  return (
      //React.createElement('h2', {}, 'Wipro Technologies Limited')
      //React.createElement('h2', {style: {color: 'blue'}}, 'Wipro Technologies Limited')
      
      React.createElement('div', {style: {backgroundColor: 'aquamarine', padding: '10px'}},
                                    createElement('h2', {}, 'Wipro Technologies'),
                                    createElement('img', {src: 'https://akm-img-a-in.tosshub.com/businesstoday/images/story/202310/wipro_2-sixteen_nine.jpg', width: '300px'})
      ) 
  )
}

export default Header
