let calc = function (op1 = 0, op2 = 0, operator) {
    let res = 0
    if (operator == '+')
        res = `Sum = ${op1 + op2}`
    else if (operator == '-')
        res = `Diff = ${op1 - op2}`
    else if (operator == '*')
        res = `Product = ${op1 * op2}`
    else if (operator == '/')
        res = `Divide = ${op1 / op2}`
    else
        res = 'Invalid Operation'

    console.log(res)
}

//function call
calc(10, 20, '+')
calc(10, 20, '-')
calc(10, 20, '*')
calc(10, 20, '/')
calc(10, 20, '?')
