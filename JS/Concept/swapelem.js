let arr=[1,2,3,4,5];
let n= arr.length;
for(let i=0;i<Math.ceil(n/2);i++)
{
    let temp=arr[i];
    arr[i]=arr[n-1-i];
    arr[n-1-i]=temp;
}
console.log(arr);