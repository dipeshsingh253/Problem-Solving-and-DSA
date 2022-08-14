let str = "aabccdddf";
let n = str.length;
let charMap = {};

// for(let i=0;i<str.length;i++){
//     let char=str[i];
//     charMap[char]=charMap[char] ? charMap[char] + 1:1;
// }
// //console.log("charmap: " + charMap);

// for(let char in charMap) {
//     //console.log(char);

// }
// longestOddRepeat(n,str);
// function longestOddRepeat(n,str)
// {
//     let char =[];
//     let counts = [];
//     let precount = 0;
//    var count=0,oddCount=0;
//    for(let i=0;i<str.length;i++)
//    {
//     //    if(arr[i]%2!==0)
//     //    {
//         //console.log(count);
//            if(str[i]!==str[i-1] && i!==0)
//            {
//                precount = count;
//                console.log("count: " + precount);
//                count=0;
//                if(count==0){
//                 char.push(str[i-1]);
//                 counts.push(precount);
//                }
               
//            }
           
//            count++;
//            //console.log(count);
//            if(i==n-1){
//             char.push(str[i]);
//             counts.push(count);
//            }
           
//         //    if(oddCount<count)
//         //    {
//         //        oddCount=count;
//         //    }
//        //}
//    }
//    //return oddCount;
//    //console.log(count);
//    console.log("char"+" :"+char);
//    console.log("count"+" :"+counts);

// }
cipherString(n,str);
function cipherString(n,str){
    let count = 0;
   // let precount = 0;
    let counts = [];
    let chars = [];

    for(let i=0;i<n;i++){
        if(str[i]!==str[i-1] && i!==0){
            //precount=count;
            chars.push(str[i-1]);
            counts.push(count);
            count=0;
        }
        count++;
        if(i==n-1){
            chars.push(str[i]);
            counts.push(count);
        }
    }

    console.log(chars);
    console.log(counts);
}