import {createContext, useContext, useState} from 'react'

const AuthContext = createContext(null);

export const AuthProvider = ({children}) => {
  const [user, setUser] = useState(null) 

  const login = uname => {
    setUser(uname)
  }  

  const logout = () => {
    setUser(null)
  }

  return (
    <AuthContext.Provider value={{user, login, logout}}>
        {children}
    </AuthContext.Provider>
  )
}

//define a function to return the value of AuthContext
export const useAuth = () => {
    return useContext(AuthContext)
}