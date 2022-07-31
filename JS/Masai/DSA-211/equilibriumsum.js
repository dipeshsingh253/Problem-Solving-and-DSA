let n=5;
let arr = [3 ,3 ,5 ,5, 1];
equilibriumElement(n,arr);
function equilibriumElement(N,arr){
    let sum = 0; 
    let leftsum = 0;
    let flag =  false;
   
   
   
    for (let i = 0; i < N; ++i){
        
        sum += arr[i];
    }

   
    for (let i = 0; i < N; ++i)
    {
        sum -= arr[i]; 
       
        if (leftsum == sum){
            console.log(i+1)
            flag =true;
            break;
        }
          leftsum += arr[i];
    }
    
    
    
    
    if(flag===false)
    {
        console.log(-1)
    }
}

