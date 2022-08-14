let N=8;
let day = "Wednesday";

dayOfTheWeek(day, N);
function dayOfTheWeek(day, N) {
    //write code here
    let arr=["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"];
  
    for(let i=0;i<arr.length;i++)
    {
        let index = arr.indexOf(arr[i]);
   
        if(N>7 && arr[i]==day)
        {
            if(i+(N%7)<arr.length)
            {
                console.log(arr[i+(N%7)]);
                
            }
            else if(i+(N%7)>=arr.length)
            {
                console.log(arr[Math.abs((i+N)%7)]);
            }
             
            
        }
        else if(N<=arr.length && arr[i]==day)
        {
            let this_week = arr.length - index;
            let newIndex = N- this_week;
            console.log(arr[newIndex]);
        
          
        }
    }
  }