export let greetings = (name) => {
    console.log(name);
    document.querySelector('#main-content').innerHTML = `Hello, ${name}`;
}