import greetings from "./greetings.js";

const btn = document.getElementById("buttonClick");

//btn.addEventListener("click", showWelcome);

function showWelcome() {
  greetings();
  console.log("hello");
}