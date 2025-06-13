const MathLib = require("../src")

let mathLib = null;

beforeAll(() => {
    console.log('before all test cases')
    mathLib = new MathLib()
})

afterAll(() => {
    console.log('test completed')
    mathLib = null;
})

describe('Mathematical Utilities', () => {

    describe('add', () => {
        test('adds 2 numbers', () => {
           // const mathLib = new MathLib();
            const actualValue = mathLib.add(10, 20);
            const expectedValue = 30;
            expect(actualValue).toBe(expectedValue)
        })       
    })

    describe('multiply', () => {
        it('multiply 2 numbers', () => {
           // const mathLib = new MathLib();
            const actualValue = mathLib.multiply(7, 8);
            const expectedValue = 56;
            expect(actualValue).toBe(expectedValue)
        })       
    }) 
    
    describe('even', () => {
        it('is even', () => {
           // const mathLib = new MathLib();
            const actualValue = mathLib.checkEven(10)           
            expect(actualValue).toBeTruthy()
        })       
    })  
    
    describe('not even', () => {
        it('is not even', () => {
            //const mathLib = new MathLib();
            const actualValue = mathLib.checkEven(11)           
            expect(actualValue).toBeFalsy()
        })       
    })     
})