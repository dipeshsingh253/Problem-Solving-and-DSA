let str1="anagram";
let str2="nag a ram";

let x=checkAnagram(str1,str2);
console.log(x);
function checkAnagram(str1,str2)
 {
     str1=str1.split("").sort().join("").trim();
     str2=str2.split("").sort().join("").trim();
     
     
     if(str1.length!== str2.length)
     {
         return "False";
     }
     else if(str1==str2)
     {
         return "True";
     }
     else
     {
         return "False";
     }
    
 }
 