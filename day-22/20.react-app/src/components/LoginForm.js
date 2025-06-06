import React, {useState} from 'react'

const LoginForm = () => {
  const [state, setState] = useState({
        email: '',
        password: '',
        message: ''
  })  

  const handleLoginButtonClick = () => {
    if(state.email==='admin' && state.password==="1234"){
        setState({...state, message: <span className='text-success'>Authenticated User</span>})
    }else{
        setState({...state, message: <span className='text-danger'>Authentication Failed.. Try Again</span>})
    }
  }

  return (
    <div className="col-lg-3 m-5 bg-info p-3 rounded-5">
            <h4 className="m-1 p-2 border-bottom">Login</h4>
            
            {/* Email starts */}
            <div className="form-group form-row">
                <label className="col-lg-4">Email:</label>
                <input
                    type="text"
                    className="form-control"   
                    value={state.email} 
                    autoFocus="autoFocus"
                    onChange={(event) => setState({...state, email:event.target.value, message:''})}              
                />
            </div>
            {/* Email ends */}   

            {/* Password starts */}
            <div className="form-group form-row mt-2">
                <label className="col-lg-4">Password:</label>
                <input
                    type="password"
                    className="form-control"   
                    value={state.password}  
                    onChange={(event) => setState({...state, password:event.target.value, message:''})}               
                />
            </div>
            {/* Password ends */}

            <div className="text-end text-center mt-3">
              {state.message}  
            
              <br></br>
            
              <button className="btn btn-primary mt-4" onClick={handleLoginButtonClick}>Login</button>
            </div>                     
    </div>
  )
}

export default LoginForm
