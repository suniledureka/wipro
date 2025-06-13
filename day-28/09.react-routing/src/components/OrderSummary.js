import {useNavigate} from 'react-router-dom'

const OrderSummary = () => {
  const navigate = useNavigate();

  return (
    <div>
      <h3 className="text-primary mb-4">
        Thanks for Ordering!!!<br/>
        We will initiate dispatch soon....
      </h3>

      <button className="btn btn-info p-2 me-5" onClick={() => navigate('/home')}>Go Back</button>

      <button className="btn btn-info p-2" onClick={() => navigate(-1)}>Go Back</button>
    </div>
  )
}

export default OrderSummary
