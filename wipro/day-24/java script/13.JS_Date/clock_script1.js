let india = document.querySelector('#india')
let usa = document.getElementById('usa')
let england = document.getElementById('england')
let australia = document.querySelector('#australia')
let today,time, flag=1

let show_time = ()=>{
    if(flag==1){
        today = new Date()    
    }
    else{       
        today = new Date(time)
        time = time+1000
        //console.log(`${time} - ${today}`)
    }
    let india_time = today.toLocaleTimeString('hi-IN',{timeZone:'Asia/Calcutta'}).toUpperCase()
    let usa_time = today.toLocaleTimeString('en-US',{timeZone:'America/New_York'})
    let england_time = today.toLocaleTimeString('en-GB',{timeZone:'Europe/London',hour12:true}).toUpperCase()
    let australia_time = today.toLocaleTimeString('en-AU',{timeZone:'Australia/sydney'})

    india.innerHTML = 'DELHI<br>'+india_time
    usa.innerHTML = 'NEW YORK<br>'+usa_time
    england.innerHTML = 'LONDON<br>'+england_time
    australia.innerHTML = 'SYDNEY<br>'+australia_time
}

let handle = setInterval(show_time,1000)

let pause_clock = ()=>{
    time = today.getTime()
    flag=0
    clearInterval(handle)
}

let continue_clock = ()=>{    
    handle = setInterval(show_time,1000)    
}