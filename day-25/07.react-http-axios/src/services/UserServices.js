import axios from 'axios'

class UserServices{

    static getAllUsers(){
        const serviceURL = 'https://jsonplaceholder.typicode.com/users'
        return axios.get(serviceURL)
    }
    
}

export default UserServices;