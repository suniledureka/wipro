import {render, screen, fireEvent} from '@testing-library/react'
import userEvent from "@testing-library/user-event"

import Login, { validateEmail } from '../Login'

describe("Test Login Component", () => {
    test('render the Login form with 2 buttons', async () => {
        render(<Login />)
        const buttonList = await screen.findAllByRole('button')
        //console.log(buttonList) // retuns Promise with state pending
        expect(buttonList).toHaveLength(2);
    })

    test("should be failed on email validation", () => {
        const testEmail = "sanjay";
        const actual = validateEmail(testEmail);
        //expect(actual).toBe(false)
        expect(actual).not.toBe(true)
    })

    test("email inputfield should accept email", () => {
        render(< Login />);
        const emailField = screen.getByPlaceholderText("Enter email");
        userEvent.type(emailField, "info@edureka.co") //user enteres "info@edureka.co" in text field
        expect(emailField.value).toMatch("info@edureka.co")
    })

    test("password input should have type password", () => {
        render (<Login />)
        const passwordField = screen.getByPlaceholderText("Password")
        expect(passwordField).toHaveAttribute("type", "password")
    })  

    test("should be able to reset the form elements", () => {
       const {getByLabelText, getByTestId} = render (<Login />)
       const resetBtn = getByTestId("reset")
       const emailInputField = getByLabelText("Email")
       const passwordInputField = getByLabelText("Password")
       fireEvent.click(resetBtn);
       
       expect(emailInputField.value).toMatch("")
       expect(passwordInputField.value).toMatch("")
    })

    test("should be able tosubmit the form" , () => {
        render(<Login/>)

    })

    test("should display error for incorrect email ", () => {
        
    })
})