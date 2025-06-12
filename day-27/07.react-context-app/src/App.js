import React from 'react';
import './App.css';
import ComponentA from './components/ComponentA';

export const UserContext = React.createContext()
export const ChannelContext = React.createContext();

function App() {  
  console.log(UserContext)
  const channelName = "Wipro";

  return (
    <div className="App">
      <h1>App Component</h1>

      <UserContext.Provider value={"admin"}>
         <ChannelContext value={channelName}>
          <ComponentA />
         </ChannelContext>  
      </UserContext.Provider>

    </div>
  );
}

export default App;
