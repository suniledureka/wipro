import React, {useState, useEffect} from 'react'

const ProductsList = () => {
  const [products, setProducts] = useState([]);

  /*
     fetch("http://localhost:3001/products")
      .then(response => response.json())
      .then(data => setProducts(data));  
  */
  
  useEffect(() => {
    fetch("http://localhost:3001/products")
      .then(response => response.json())
      .then(data => setProducts(data));  
  }, []);

  console.log(products)
  {/*
  return (
      <div>
      <h2>Products List</h2>
      <table border="1" width="50%" style={{fontSize: "18px", textAlign: "left"}}>
        <thead>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>PRICE</th>
                <th>IN_STOCK</th>
            </tr>
        </thead>

        <tbody>
            {
                products.map(prod => 
                    <tr>
                        <td>{prod.id}</td>
                        <td>{prod.name}</td>
                        <td>{prod.price}</td>
                        <td>{prod.in_stock? 'IN STOCK' : 'NOT IN STOCK'}</td>
                    </tr>
                )
            }
        </tbody>
      </table>
    </div>
  )
    */}

    return (
        <section>
            { products.map((product) => (
                <div className="card" key={product.id}>
                    <p className="id">{product.id}</p>
                    <p className="name">{product.name}</p>
                    <p className="info">
                        <span>&#8377; {product.price}</span>
                        <span className={product.in_stock ? "instock" : "unavailable"}>{product.in_stock ? "In Stock" : "Unavailable"}</span>
                    </p>
                </div>            
            )) }
        </section>
      )
    
}

export default ProductsList
