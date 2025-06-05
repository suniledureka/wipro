import React from 'react'

const NamesList = () => {
  const participants = ["Sanjay", "Praveen", "Shankar"]  

  //const participantsList = participants.map(participant => <h3>{participant}</h3>)

  const participantsList = participants.map((participant, index) => <h3 key={index}>{participant}</h3>)
  return (
    <div>
     {/* 
      <h3>{participants[0]}</h3>
      <h3>{participants[1]}</h3>
      <h3>{participants[2]}</h3>
       */}

      {/* 
       {
        participants.map(participant => <h3>{participant}</h3>)
       }
      */}

      {
        participantsList
      }
    </div>
  )
}

export default NamesList
