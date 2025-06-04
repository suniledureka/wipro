import React from 'react'

function TopicsCard(props) {
  console.log(props)
  return (
    <div className="card w-25 m-4 d-inline-block">
      <div className="card-header text-center bg-warning">
        <h3>{props.topic}</h3>
      </div>

      <div className="card-body">
        <h5 className="card-title text-success fw-bold">{props.slno}. {props.title}</h5>
        <p className="card-text">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Cum et culpa esse reiciendis dignissimos, quos eligendi doloremque deserunt .</p>
      </div>

      <div className="card-footer">
        <a className="btn btn-primary">more details</a>
      </div>
    </div>
  )
}

export default TopicsCard
