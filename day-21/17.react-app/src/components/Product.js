import React from 'react'

/*
const Product = (props) => {
  console.log(props)  
  return (    
        <tr key={props.product.productId}>
            <td>{props.product.productId}</td>
            <td>{props.product.productName}</td>
            <td>{props.product.productPrice.toFixed(2)}</td>
        </tr>
  )
}
  */

const Product = ({product}) => {
  console.log(product)  
  return (    
        <tr key={product.productId}>
            <td>{product.productId}</td>
            <td>{product.productName}</td>
            <td>{product.productPrice.toFixed(2)}</td>
        </tr>
  )
}

export default Product
