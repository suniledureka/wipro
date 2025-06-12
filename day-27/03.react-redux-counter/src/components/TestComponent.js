import { useSelector, useDispatch } from 'react-redux'

const TestComponent = () => {
  const count = useSelector(state => state.count);

  return (
    <div>
      <h1 style={{width:"100px", height:"100px", textAlign: "center", borderRadius:"50%", backgroundColor: 'maroon', lineHeight: "2.5", boxShadow:"0 0 10px black", color: 'white'}}>{count}</h1>
    </div>
  )
}

export default TestComponent
