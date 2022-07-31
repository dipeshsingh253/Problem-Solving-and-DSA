// let arr1 = [1, 2, 3, 4, 5];
// let arr2 = [10.9, 8, 7, 6, 5, 4, 3, 2, 1];

let x = [...new Set([...arr1, ...arr2])].sort((a,b)=>{return a-b});
// console.log(x);