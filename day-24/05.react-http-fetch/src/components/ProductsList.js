import { useState, useEffect } from 'react'

const ProductsList = () => {
    const [products, setProducts] = useState([])
    const [errorMsg, setErrorMsg] = useState("")

    /*
    useEffect(() => {
        fetch('http://localhost:3001/products')
            .then(response => response.json())
            .then(data => setProducts(data))
            .catch(err => setErrorMsg('HTTP Status 404 - Server Down - Try After some time'))
    }, [])
   */

    useEffect(() => {
        fetch('http://localhost:3001/products')
            //fetch('http://localhost:3001/productss')
            .then(response => {
                //console.log(response)
                if (!response.ok) {
                    throw new Error('HTTP error - ' + response.statusText)
                }
                return response.json()
            })
            .then(data => {
                console.log(data)
                setProducts(data)
            })
            .catch(err => {
                console.log(err)
                //setErrorMsg(err.message)
                setErrorMsg('HTTP Status 404 - Server Down - Try After some time')
            })
    }, [])

    return (
        errorMsg ? <p style={{ fontSize: '25px', color: 'red' }}>{errorMsg}</p> :
            <section>
                <h1 className="heading">List of Products</h1>
                {
                    products.map(product => (
                        <div key={product.id} className="card">
                            <p className="id">{product.id}</p>
                            <p className="name">{product.name}</p>

                            <img src={product.poster} style={{ width: "150px", margin: "auto" }}></img>

                            <p className="info">
                                <span> &#8377; {product.price.toFixed(2)}</span>
                                <span className={product.in_stock ? "instock" : 'unavailable'}>
                                    {product.in_stock ? "In Stock" : 'Not In Stock'}
                                </span>
                            </p>
                        </div>
                    ))
                }
            </section>
    )
}

export default ProductsList