let n= 6;
let str="aabbcc";

detectPalII(n, toString);
function detectPalII(N, string){
    //write code here
     let charMap={};

    for(i=0;i<string.length;i++)
    {
    	let char=string[i];
        charMap[char]=charMap[char] ? charMap[char] + 1:1;
          
    }
  
    
    
    let oddCharFreq=false;
    let poss=true;
    
    for(let char in charMap)
    {
    	let freq=charMap[char];
    
    	if(freq%2!==0){
    		if(oddCharFreq){
    			poss=false;
    			break;
    		}else{
    			oddCharFreq=true;
    		}
    	}
    }
    if(poss){
    	console.log("Possible!");
    }else{
    	console.log("Not Possible!");
    }
}
