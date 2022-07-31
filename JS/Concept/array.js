let arr = [1,2,3,4,5,6,7,8,9,10];
let n = arr.length;
 let y= arr.slice(0,10);
let i=0;
let j=1;
while(j<=n)
{
    let x = arr.slice(i,j);
    console.log(x.join("\r\n"));
    j++;
}
// console.log(y);
// console.log(y.join("\n"));
// console.log(arr.join("\r\n"));

// const myArray = []
// for (let i = 0; i < 1000; i++) {
//   myArray.push(i)
// }