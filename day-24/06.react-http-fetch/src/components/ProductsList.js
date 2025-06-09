import React, { useEffect, useState } from 'react'

const ProductsList = () => {
  const [products, setProducts] = useState([])
  const [errorMsg, setErrorMsg] = useState("")

  const [product, setProduct] = useState({
    id: '',
    name: "",
    poster: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2WsKSWQbkvcTfals9vQDN31_WLdVfnimRdA&s",
    in_stock: true,
    price: 0
  })

  async function getAllProducts() {
    const response = await fetch("http://localhost:3001/products")   
    const data = await response.json();
    setProducts(data)
  }

  useEffect(() => {
    getAllProducts()
  }, [])

  const handleChange = (evt) => {
    console.log(evt.target.name, evt.target.value, typeof (evt.target.value))
    const idVal = Math.floor(Math.random() * 1000)
    if (evt.target.name === 'in_stock') {
      if (evt.target.value === 'true') {
        setProduct({ ...product, in_stock: true, id: idVal })
      } else {
        setProduct({ ...product, in_stock: false, id: idVal })
      }
    }
    else {
      setProduct({
        ...product,
        id: idVal,
        [evt.target.name]: evt.target.value
      })
    }
  }

const handleSaveButtonClick = () => {    
    //setProduct({ ...product, id: idVal })
    fetch("http://localhost:3001/products", {
      //provide the method name
      method: 'POST',

      //add request body
      body: JSON.stringify(product),

      //provide the request header
      "Content-Type": "application/json"
    })
      .then(response => {
        alert('Product Added')
        setProducts([...products, product])
        setProduct({
          id: '',
          name: "",
          poster: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2WsKSWQbkvcTfals9vQDN31_WLdVfnimRdA&s",
          in_stock: true,
          price: 0
        })
      })
      .catch(error => alert(`Product could not be saved - ${error.status}`))
  }

  return (
    errorMsg ? <p style={{ textAlign: 'center', fontSize: '18px', color: 'red' }}>{errorMsg}</p> :
      <div>
        <h1>Products List</h1>

        <section>
          {
            products.map(prod => (
              <div className="card d-inline-block m-2 h-100" style={{ width: '300px' }} key={prod.id}>
                <img className='card-img-top' src={prod.poster} />

                <div className="card-body">
                  <p className="id">{prod.id}</p>
                  <h5 className="card-title">{prod.name}</h5>

                  <p className="card-text">
                    Price: &#8377; {prod.price}</p>
                  <a href="#" className={prod.in_stock ? 'btn btn-success' : 'btn btn-danger'}>
                    {prod.in_stock ? 'In Stock' : 'Out Of Stock'}
                  </a>

                </div>
              </div>
            ))
          }
        </section>

        <div className="col-lg-3 m-5 bg-info p-2">
          <h4 className="m-1 p-2 border-bottom">Add New Product</h4>
          <div className="form-group form-row">
            <label className="col-lg-4">Name:</label>
            <input
              type="text"
              className="form-control"
              autoFocus="autoFocus"
              name="name"
              value={product.name}
              onChange={handleChange}
            />
          </div>

          <div className="form-group form-row mt-2">
            <label className="col-lg-4">Price:</label>
            <input
              type="number"
              className="form-control"
              name="price"
              value={product.price}
              onChange={handleChange}
            />
          </div>

          <div className="form-group form-row mt-2">
            <label className="col-lg-4">In-Stock:</label>
            <select value={product.in_stock} onChange={handleChange} name="in_stock">
              <option value={true}>Yes</option>
              <option value={false}>No</option>
            </select>
          </div>

          <div className="text-end text-center mt-3">

            <br /><br />
            <button className="btn btn-primary" onClick={handleSaveButtonClick}>Save Product</button>
          </div>
        </div>

      </div>
  )
}

export default ProductsList
