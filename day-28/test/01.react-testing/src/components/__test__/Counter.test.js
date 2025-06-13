import React from 'react'
import { render } from '@testing-library/react'
import Counter from '../Counter'
import userEvent from '@testing-library/user-event' 

describe('Testing Counter Component' , () => {

    it("finding title", () => {
        const component = render(<Counter title="React Testing"/>)
        //console.log(component)
        //expect(component.getByText('React Testing')).toBeInTheDocument()
        expect(component.getByText('React Testing')).toBeTruthy()
    })

    it("finding title 01", () => {
        const { getByText } = render(<Counter title="React Testing"/>)
        //expect(getByText('React Testing')).toBeInTheDocument()
        expect(getByText('React Testing')).toBeTruthy()
    }) 
    
    test("finding title by testid", () => {
        const { getByTestId } = render(<Counter title="React Testing"/>)
        //expect(getByTestId('title')).toBeInTheDocument()
        //expect(getByTestId('title')).toBeTruthy()
        //expect(getByTestId('title')).toHaveTextContent("Testing")
        expect(getByTestId('title')).toHaveTextContent(/^React Testing/)
    })     

    test("finding initial count value be 0", () => {
        const { getByTestId } = render(<Counter title="React Testing"/>)
        expect(getByTestId('count')).toHaveTextContent(0)
    })   
    

    test("checking count value after one time button click", () => {
        const { getByTestId } = render(<Counter title="React Testing"/>)
        const btnElement = getByTestId('btnClick')
        userEvent.click(btnElement)

        expect(getByTestId('count')).toHaveTextContent(1)
    })
    
    test("checking count value after multiple button click", () => {
        const { getByTestId } = render(<Counter title="React Testing"/>)
        const btnElement = getByTestId('btnClick')
        
        userEvent.click(btnElement)
        userEvent.click(btnElement)
        userEvent.click(btnElement)

        expect(getByTestId('count')).toHaveTextContent(3)
    })       
})