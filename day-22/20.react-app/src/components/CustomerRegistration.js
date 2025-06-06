import { useState } from 'react'
import './CustomerRegistration.css'

const CustomerRegistration = () => {

    const [customerData, setCustomerData] = useState({
        customerName: '',
        course: '',
        comments: ''
    })


    const handleCustomerNameChange = (event) => {
        setCustomerData({
            ...customerData,
            customerName: event.target.value
        })
    }


    const handleCourseChange = (event) => {
        setCustomerData({
            ...customerData,
            course: event.target.value
        })
    }

    const handleCommentsChange = (event) => {
        setCustomerData({
            ...customerData,
            comments: event.target.value
        })
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(customerData)
        alert(`Customer Name: ${customerData.customerName}\n
               Course: ${customerData.course}\n
               Comments: ${customerData.comments}`)
    }
        
    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>Customer Name</label>
                <input
                    type="text"
                    autoFocus="autoFocus"
                    value={customerData.customerName}
                    onChange={handleCustomerNameChange}
                />
            </div>

            {/* adding a select with options */}
            <div>
                <label>Course</label>
                <select value={customerData.course} onChange={handleCourseChange}>
                    <option value="">select a course</option>
                    <option value="React">React</option>
                    <option value="Vue">Vue.js</option>
                    <option value="Angular">Angular</option>
                    <option value="Next">Next.js</option>
                </select>
            </div>

            {/* adding a text area */}
            <div>
                <label>Comments</label>
                {/* <textarea value={customerData.comments} onChange={handleCommentsChange}/> */}
                <textarea value={customerData.comments} onChange={event => setCustomerData({ ...customerData, comments: event.target.value })} />
            </div>

            <div>
                <button type="submit">Submit</button>
            </div>
        </form>
    )
}

export default CustomerRegistration

