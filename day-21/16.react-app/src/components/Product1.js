import { useState } from 'react'

const Product1 = () => {

    const [product, setProduct] = useState({
        productId: 101,
        productName: 'Mobile',
        productPrice: 65750.5
    })

    const {productId, productName, productPrice} = product;  //object destructuring

    function handleProductChange(){
        setProduct({
            ...product,
            productName: product.productName.toUpperCase()
        })
    }

    return (
        <div className="card w-25 m-3 ">
            <div className="card-header bg-dark text-white">
                <h5>PRODUCT</h5>
            </div>

            <div className="card-body text-start fs-5">
                <p>ID: {productId}</p>
                <p>Name: {productName}</p>
                <p>Price: {productPrice}</p>
            </div>

            <div className="card-footer">
                <a herf="#" className="btn btn-warning" onClick={() => handleProductChange()}>Change Case</a>
            </div>
        </div>

    )
}

export default Product1
