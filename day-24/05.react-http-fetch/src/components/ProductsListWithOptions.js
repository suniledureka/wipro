import { useState, useEffect } from 'react'

const ProductsListWithOptions = () => {
    const [products, setProducts] = useState([])
    const [errorMsg, setErrorMsg] = useState("")

    const [url, setUrl] = useState('http://localhost:3001/products')

    async function getProducts() {
        try {
            const response = await fetch(url);
            const data = await response.json();
            setProducts(data)
        } catch (err) {
            setErrorMsg('HTTP Status 404 - Server Down - Try After some time')
        }
    }

    useEffect(() => {
        getProducts();
    }, [url])



    return (
        errorMsg ? <p style={{ fontSize: '25px', color: 'red' }}>{errorMsg}</p> :
            <section>
                <h1 className="heading">List of Products</h1>

                <article className="filter" style={{marginBottom: "30px"}}>

                    <button className="all" onClick={() => setUrl('http://localhost:3001/products')}>All</button>

                    <button onClick={() => setUrl('http://localhost:3001/products?_sort=price')} >Ascending</button>

                    <button onClick={() => setUrl('http://localhost:3001/products?_sort=-price')}>Descending</button>

                    <button className="onlyStock" onClick={() => setUrl('http://localhost:3001/products?in_stock=true')}>In-Stock</button>

                    <button  onClick={() => setUrl('http://localhost:3001/products?in_stock=false')}>Out-Stock</button>
                </article>

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

export default ProductsListWithOptions