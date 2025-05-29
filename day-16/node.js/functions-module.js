const add = (x = 0, y = 0) => x + y

const multiply = (x = 0, y = 0) => {
    return x * y;
}

function sanitizeInput(inputParam, outputFile){
    console.log(`sanitizing input - ${inputParam} - ${outputFile}`)
}

const apiKey = 'gssr4gsf3jsjs8rtft';

module.exports = { add, multiply, sanitizeInput, apiKey }