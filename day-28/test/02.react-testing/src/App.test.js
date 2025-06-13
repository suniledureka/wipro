import { render, screen } from '@testing-library/react';
import App from './App';

test('header renders with react testing', () => {
  render(<App />);
  const linkElement = screen.getByText(/react testing/i);
  expect(linkElement).toBeInTheDocument();
});

test('render login component in document', () => {
  const component = render( <App />);
  //console.log(component)  //- to check and to see all the methods that can be used
  const childElement = component.getByLabelText("Email");
  expect(childElement).toBeInTheDocument()
})
