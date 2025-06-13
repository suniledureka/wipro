import { useAuth } from './auth'
import { useNavigate } from 'react-router'

const Profile = () => {
  const auth = useAuth()  
  const navigate = useNavigate();

  const handleLogoutBtnClick = () => {
    auth.logout();
    navigate("/", {replace: true})
  }

  return (
    <div>
      <h3>Welcome {auth.user} </h3>
      <button onClick={handleLogoutBtnClick}>Logout</button>
    </div>
  )
}

export default Profile
