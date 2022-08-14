let str = "racecar"; /// inputs => "1221" etc.

// there is one more logical way for 1221 but i will add it later...

isPalindrome(str);
detectPalII(str);
function isPalindrome(str)
{
    let strleft="";
    let strright="";
    let n=str.length;
    let left=0;
    let right=n-1;
    
    for(let i=0;i<Math.ceil(n/2);i++)
    {
        strleft+=str[left++];
        strright+=str[right--];
    }
    
    if(strleft==strright)
    {
        console.log("Yes");
    }
    else
    {
        console.log("No");
    }
    
}

function detectPalII(string){
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