import './App.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faWhatsapp, faAccusoft, faAirbnb, faAmazon, faAmazonPay, faAws, faCcAmazonPay } from '@fortawesome/free-brands-svg-icons'
import {faCab, faCar, faCaretUp, faCoffee} from '@fortawesome/free-solid-svg-icons'



function App() {
  return (
    <>
     <FontAwesomeIcon icon={faWhatsapp} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAccusoft} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAirbnb} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAmazon} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faCcAmazonPay} className="fs-1 p-3" />

     <FontAwesomeIcon icon={faCab} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faCaretUp} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faCar} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faCoffee} className="fs-1 p-3" />
    </>    
  );
}

export default App;
