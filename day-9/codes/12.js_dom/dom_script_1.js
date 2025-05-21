let doc = document
//alert(typeof doc)
console.log(doc) //HTMLDocument

console.log(`Title = ${doc.title}`)
console.log(`Active Link Color = ${document.alinkColor}`)
console.log(`Link Color = ${document.linkColor}`)
console.log(`Background Color = ${document.bgColor}`)
console.log(`Foreground Color = ${document.fgColor}`)
console.log(`No of Links = ${document.links.length}`)
console.log(`URL = ${document.URL}`)

//get the reference of an element (article_1)
let article_1 = document.getElementById('article_1')
let matter = article_1.innerHTML
console.log(matter)
matter = article_1.innerText
console.log(matter)

//article_1.innerHTML = '<h1>Some Text</h1>'
article_1.innerText = '<h1>Some Text</h1>'
