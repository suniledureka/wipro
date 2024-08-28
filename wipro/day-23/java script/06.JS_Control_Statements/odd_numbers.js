let odd_numbers = document.getElementById('odd_numbers')
let input1 = document.getElementById('input-element-1')
let input2 = document.getElementById('input-element-2')

function getOddNumbers()
{
  let fno = input1.value
  let lno = input2.value
  
  let res = ''
  fno = parseInt(fno) //to convert a String to number

  fno = (fno%2 == 0)?fno+1:fno+2
  
  while(fno<lno){
      if(res.length==0)
        res=fno
      else
        res=res+', '+fno
      
      fno = fno+2  
  }
  odd_numbers.innerText = res
}