import { useState } from 'react'
import { useAuth } from './auth'
import { useNavigate } from 'react-router'

const Login = () => {
  const [user, setUser] = useState("")
  const auth = useAuth();
  //console.log(auth)
  const navigate = useNavigate()
    
  const handleLoginBtnClick = () => {
    auth.login(user);
    navigate("/")
  }

  return (
    <div>
      <label>User Name</label> 
      <input type="text" onChange={e => setUser(e.target.value)} autoFocus="autofocus"/>
      <button onClick={handleLoginBtnClick}>Login</button>
    </div>
  )
}

export default Login
