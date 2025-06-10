import { useEffect, useState } from "react"
import UserServices from "../services/UserServices"

const UsersList = () => {
  const [users, setUsers] = useState([])  
  
  useEffect(() => {
    UserServices.getAllUsers()
        .then(response => {
            //console.log(response.data)
            setUsers(response.data)
        })
        .catch(err => console.log(err))        
  }, [])

  return (
    <div className="container m-4">
      <h2>List of Users</h2>
      <table className="table table-striped table-bordered table-hover table-dark m-auto w-100">
        <thead className="table-warning">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>USER NAME</th>
                <th>CITY</th>
                <th>COMPANY</th>
            </tr>
        </thead>
        <tbody>
            {
                users.length > 0 && (
                    users.map(user => <tr key={user.id}>
                        <td>{user.id}</td>
                        <td>{user.name}</td>
                        <td>{user.username}</td>
                        <td>{user.address.city}</td>
                        <td>{user.company.name}</td>
                    </tr>)
                )
            }
        </tbody>
      </table>
    </div>
  )
}

export default UsersList
