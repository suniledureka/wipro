let india = document.querySelector('#india')
let usa = document.getElementById('usa')
let england = document.getElementById('england')
let australia = document.querySelector('#australia')

let show_time = ()=>{
    let today = new Date()

    let india_time = today.toLocaleTimeString('hi-IN',{timeZone:'Asia/Calcutta'}).toUpperCase()
    let usa_time = today.toLocaleTimeString('en-US',{timeZone:'America/chicago'})
    let england_time = today.toLocaleTimeString('en-GB',{timeZone:'Europe/London',hour12:true}).toUpperCase()
    let australia_time = today.toLocaleTimeString('en-AU',{timeZone:'Australia/sydney'})

    india.innerHTML = 'DELHI<br>'+india_time
    usa.innerHTML = 'CHICAGO<br>'+usa_time
    england.innerHTML = 'LONDON<br>'+england_time
    australia.innerHTML = 'SYDNEY<br>'+australia_time

    setTimeout(show_time,1000)
}

//setInterval(show_time,1000)