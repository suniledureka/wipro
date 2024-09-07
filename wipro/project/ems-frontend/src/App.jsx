import './App.css'
import EmployeeAdd from './components/EmployeeAdd'
import EmployeesList from './components/EmployeesList'
import Footer from './components/Footer'
import Header from './components/Header'
import {BrowserRouter, Routes, Route} from 'react-router-dom'

function App() {  
  return (
    <>
    <BrowserRouter>
      <Header />

      <Routes>
        <Route path='/' element={<EmployeesList />} />
        
        <Route path='/employees' element={<EmployeesList />} />

        <Route path="/add-employee" element={<EmployeeAdd />}/>

        <Route path="/edit-employee/:id" element={<EmployeeAdd />}/>
      </Routes>
      
      <Footer />
    </BrowserRouter>  
    </>
  )
}

export default App
