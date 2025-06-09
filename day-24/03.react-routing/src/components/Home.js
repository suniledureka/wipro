import { useNavigate } from 'react-router-dom'
import NavBar from './NavBar'


const Home = () => {
  const navigate = useNavigate();
  //console.log(navigate)

  return (
    <div>
      <h2 className="mb-5">Welcome to Wipro Technologies</h2>

      <button className="btn btn-primary p-2 me-5" onClick={() => navigate("/order-summary")}>Place Order</button>

      <button className="btn btn-primary p-2" onClick={() => navigate("/order-summary", {replace: true})}>Place Order</button>
    </div>
  )
}

export default Home
