import React, { useState } from 'react'

const Lessons = () => {
  let [flag, setFlag] = useState(true);

  let [topic, setTopic] = useState({
    message: 'Lesson-1 of ReactJS'
  })

  function nextLesson() {
    if (flag) {
      setTopic({
        message: 'Lesson-2 of ReactJS'
      })
      setFlag(false)
    } else {
      setTopic({
        message: 'Lesson-1 of ReactJS'
      })
      setFlag(true)
    }
  }

  return (
    <div>
      <p style={{ color: 'blue', fontSize: '22px', margin: '10px' }}>{topic.message}</p>
      <button onClick={nextLesson}>Next Lesson</button>     
    </div>
  )
}

export default Lessons
