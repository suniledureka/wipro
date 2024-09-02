//import ReactDOM from 'react-dom';
import ReactDOM from 'react-dom/client';
import './index.css';

function Wipro(){
    const styles = {
      color: "white",
      textShadow: '0 0 10px black',
      padding: "10px"
    }

    return(
        /*
        <h2 style = {{color: 'blue', textShadow: '0 0 10px black'}}>Wipro Technologies Limited</h2>
        */
        <div>
            <h1 style={styles}>Wipro Technologies Limited</h1>
            <h3 className="header">Gachibowli, Hyderabad, Telangana, India</h3>
            <img src="../logo.png"/>
        </div>    
    )
}

//ReactDOM.render(<h1>Wipro Technologies Limited</h1>, document.getElementById('root'))
//ReactDOM.render(<Wipro />, document.getElementById('root'))/*

const root = ReactDOM.createRoot(document.getElementById('root'))
//root.render(<h1>Wipro Technologies Limited</h1>)
root.render(<Wipro/>)