let n= 6;
let str="aabbcc";

// in this question repeation of char is allowed

detectPalII(n, str);
function detectPalII(N, string){
    //write code here
     let charMap={};

    for(i=0;i<string.length;i++)
    {
    	let char=string[i];
        charMap[char]=charMap[char] ? charMap[char] + 1:1;
          
    }
  
    //console.log("charMap: " + charMap);
    
    let oddCharFreq=false;
    let poss=true;
    
    for(let char in charMap)
    {
        console.log(char);
    	// let freq=charMap[char];
    
    	// if(freq%2!==0){
    	// 	if(oddCharFreq){
    	// 		poss=false;
    	// 		break;
    	// 	}else{
    	// 		oddCharFreq=true;
    	// 	}
    	// }
    }
    // if(poss){
    // 	console.log("Possible!");
    // }else{
    // 	console.log("Not Possible!");
    // }
}
