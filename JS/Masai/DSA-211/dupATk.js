let n = 3;
let k= 1;
let arr= [ 1, 0, 1 ];

// function checkDistance(i,j,k){
//     if(i!==j && Math.abs(i-j)<=k && i<n && j<n){
//         j++;
//         return checkDistance(i,j,k);
//     }
//     else
//     {
//         return checkDistance(i,j,k);
//     }
// }

let sorted = arr.slice().sort((a,b)=>{return a>b?1:a<b?-1:0});

console.log(arr);
console.log(sorted);
