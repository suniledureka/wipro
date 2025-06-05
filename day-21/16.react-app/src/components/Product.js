import { useState } from 'react'

const Product = () => {

    const [product, setProduct] = useState({
        productId: 101,
        productName: 'Mobile',
        productPrice: 65750.5
    })

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
                <p>ID: {product.productId}</p>
                <p>Name: {product.productName}</p>
                <p>Price: {product.productPrice}</p>
            </div>

            <div className="card-footer">
                <a herf="#" className="btn btn-warning" onClick={() => handleProductChange()}>Change Case</a>
            </div>
        </div>

    )
}

export default Product
