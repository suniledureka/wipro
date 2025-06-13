import {Link, Outlet} from 'react-router-dom'

const Products = () => {
  return (
    <div>
      <input type="search" placeholder="search a product" autoFocus="autofocus"/>
      <br/>
      
      <nav className="mt-5 fs-3">
        <Link to="featured">Featured</Link>
        &nbsp; &nbsp; &nbsp; 
        <Link to="new">New</Link>
      </nav>

      <hr />

      <Outlet/>

    </div>
  )
}

export default Products
