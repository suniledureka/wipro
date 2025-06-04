=== React Font Awesome ====
https://fontawesome.com/ > Docs 
Use Font Awesome with Your Preferred Syntax or Stack…  -- React
Set Up with React===>

1. Add SVG Core     
terminal> npm i --save @fortawesome/fontawesome-svg-core
2. Add Icon Packages - Free SVG Package
npm i --save @fortawesome/free-solid-svg-icons
npm i --save @fortawesome/free-regular-svg-icons
npm i --save @fortawesome/free-brands-svg-icons

3. Add the React Component
npm i --save @fortawesome/react-fontawesome@latest

4. Add some Icons - App.js

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faWhatsapp, faAccusoft, faAirbnb, faAmazon, faAmazonPay, faAws } from '@fortawesome/free-brands-svg-icons'

function App() {
  return (
    <>
     <FontAwesomeIcon icon={faWhatsapp} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAccusoft} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAirbnb} className="fs-1 p-3" />
     <FontAwesomeIcon icon={faAmazon} className="fs-1 p-3" />
    </>    
  );
}


