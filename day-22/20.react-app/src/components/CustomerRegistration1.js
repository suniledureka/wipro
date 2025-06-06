import { useState } from 'react'
import './CustomerRegistration.css'

const CustomerRegistration1 = () => {

    const [customerData, setCustomerData] = useState({
        customerName: '',
        course: '',
        comments: ''
    })

    const handleChange = (event) => {
        //console.log(event.target.name, event.target.value)
        const value = event.target.value;
        const fieldName = event.target.name;
        setCustomerData({
            ...customerData,
            [fieldName]: value
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
                    onChange={handleChange}
                    name="customerName"
                />
            </div>

            {/* adding a select with options */}
            <div>
                <label>Course</label>
                <select value={customerData.course} onChange={handleChange} name="course">
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
                <textarea value={customerData.comments} onChange={handleChange} name="comments"/> 
                
            </div>

            <div>
                <button type="submit">Submit</button>
            </div>
        </form>
    )
}

export default CustomerRegistration1

