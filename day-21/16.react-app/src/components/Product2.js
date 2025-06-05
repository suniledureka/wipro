import { useState } from 'react'
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const Product2 = () => {

    const [product, setProduct] = useState({
        productId: 101,
        productName: 'Mobile',
        productPrice: 65750.5
    })

    const { productId, productName, productPrice } = product;  //object destructuring

    function handleProductChange() {
        setProduct({
            ...product,
            productName: product.productName.toUpperCase()
        })
    }

    return (
        <Card style={{ width: '18rem' }}>
            <Card.Header>
                <h4>PRODUCT</h4>
            </Card.Header>
            <Card.Body>
                <Card.Title>{productName}</Card.Title>
                <Card.Text>
                    ID: {productId} <br/>
                    Price: &#8377; {productPrice} 
                </Card.Text>
                <Button variant="primary" onClick={handleProductChange}>Change Case</Button>
            </Card.Body>
        </Card>

    )
}

export default Product2
