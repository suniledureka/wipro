import { useState } from 'react'
import Product from './Product';

const ProductsList1 = () => {
    const [products, setProducts] = useState([
        { productId: 1001, productName: 'Mobile Phone', productPrice: 75000 },
        { productId: 1002, productName: 'Laptop', productPrice: 69850.50 },
        {
            productId: 1003,
            productName: 'Desktop',
            productPrice: 45750
        },
        {
            productId: 1004,
            productName: 'Tablet',
            productPrice: 28500
        }
    ]
    );
    
    const listOfProducts = products.map(prod =>  <Product key={prod.productId} product={prod} />)

    return (
        <div className="mt-4">
            <table className="table table-bordered table-hover table-striped w-75">
                <thead className="table-dark text-info text-center">
                  <tr>  
                    <th>PRODUCT ID</th>
                    <th>NAME</th>
                    <th>PRICE</th>
                  </tr>  
                </thead>
                <tbody>
                    {listOfProducts}
                </tbody>
            </table>
        </div>
    )
}

export default ProductsList1
