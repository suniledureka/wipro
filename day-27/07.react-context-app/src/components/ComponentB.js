import React from 'react'
import ComponentC from './ComponentC'
import { UserContext } from '../App'

const ComponentB = () => {
    return (
        <div>
            <UserContext.Consumer>
                {
                    user => {
                        return (
                            <div>
                                <h2>Component B - {user}</h2>
                            </div>
                        )
                    }
                }
            </UserContext.Consumer>
            
            <ComponentC />
        </div>
    )
}

export default ComponentB
