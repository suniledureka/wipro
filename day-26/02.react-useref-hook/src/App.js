import { useState, useRef, useEffect } from 'react';
import './App.css';

function App() {
  const [otp, setOtp] = useState("")
  const previousOtpRef = useRef('')

  useEffect(() => {
    previousOtpRef.current = otp
  }, [otp])

  const generateOtp = () => {
    let tempOtp = Math.ceil(Math.random() * 10000)
    if(tempOtp < 10)
      tempOtp *= 1000
    else if(tempOtp < 100)
      tempOtp *= 100
    else if(tempOtp < 1000)
      tempOtp *= 10

    setOtp(tempOtp)
  }

  return (
    <div className="App">
      <h2>Generated OTP: {otp}</h2>
      <button onClick={generateOtp}>Generate OTP</button>
      <h3>Previous OTP: {previousOtpRef.current}</h3>
    </div>
  );
}

export default App;
