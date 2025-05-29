const url = require('url')

const urlString = `http://www.wipro.com:8080/services/login.jsp?user=sanjay&pass=123456`;

//const parsedUrl = url.parse(urlString);  //deprecated
const parsedUrl = new URL(urlString);

//console.log(parsedUrl)
console.log(`Protocol = ${parsedUrl.protocol}`)
console.log(`Host = ${parsedUrl.host}`)
console.log(`Host = ${parsedUrl.hostname}`)
console.log(`Query = ${parsedUrl.query}`)
console.log(`Request Path = ${parsedUrl.pathname}`)
console.log();

//case-2 ---> resolve path
const baseURL = 'http://localhost:8080/services/'
const relativeURL = 'authService'
const finalURL = url.resolve(baseURL, relativeURL);
console.log(finalURL)
console.log()

//case-3 extract query string
const urlStr = `http://localhost:8080/login.jsp?user=sanjay&pass=123456`
const parsedUrlQuery = url.parse(urlStr);
console.log(parsedUrlQuery.query)

const searchedParams = new URLSearchParams(parsedUrlQuery.query)
console.log('user name = ' + searchedParams.get("user"))
console.log('password = ' + searchedParams.get("pass"))