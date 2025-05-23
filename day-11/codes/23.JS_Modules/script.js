//export let greetings = (name) => {
let greetings = (name) => {    
    console.log(name);
    document.querySelector('#main-content').innerHTML = `Hello, ${name}`;
    alert('Welcome ' + name)
}
export default greetings;