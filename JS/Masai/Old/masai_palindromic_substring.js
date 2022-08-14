  // substrData ====> creates an array of all substrings of the given string
function substrData(str)
{
   var i,j,substrArr=[];
   
   for(i=0;i<str.length;i++)
   {
       for(j=i+1;j<str.length+1;j++)
       {
           substrArr.push(str.slice(i,j));
       }
   }
    //return substrArr;
    let max=0;

    for(let i=0;i<substrArr.length;i++)
    {
        let check = isPalindrome(substrArr[i]);
        if(check==false)
        {
            continue;
            //console.log(check);
        }
        else
        {
            if(max<check)
            {
                max=check;
            }
        }
    }
    return max;
}



 // isPalindrome ====> checks if given string is palindrome or not
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
        //console.log("Yes");
        return str.length;
    }
    else
    {
        return false;
    }
}

let str="thisracecarisgood";
let func1 =isPalindrome(str);
let func2 =substrData(str);
console.log("func1: " + func1);
 console.log("func2: " + func2);